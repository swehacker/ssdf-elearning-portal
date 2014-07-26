package se.ssdf.elearning.domain;

import se.ssdf.i18n.I18n;

import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Personnummer implements Serializable {
    public static enum Gender {
        MALE,
        FEMALE,
        ORGANISATION
    }

    private static final long serialVersionUID = -2749354196411762242L;
    private static final int MINIMUM_AGE = 18; // INB_VR0014

    private final String personnummer;
    private final Gender gender;
    private final Date birthDate;

    // Needed for serialization
    protected Personnummer() {
        this.personnummer = "";
        this.gender = Gender.ORGANISATION;
        this.birthDate = new Date();
    }

    private Personnummer(String personnummer, Gender gender, Date birthDate) {
        this.personnummer = personnummer;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public static Personnummer create(String personnummer) throws IllegalArgumentException {
        if (personnummer == null || personnummer.isEmpty()) {
            throw new IllegalArgumentException(I18n.getI18nText("error.personnummer"));
        }

        String pNr = parse(personnummer);
        Gender gender = null;
        if (!isValid(pNr)) {
            throw new IllegalArgumentException(I18n.getI18nText("error.personnummer"));
        }

        if (!isCompany(personnummer)) {
            gender = Gender.ORGANISATION;
        } else {
            gender = getGender(personnummer);
        }

        return new Personnummer(pNr, gender, getBirthDate(personnummer));
    }

    /**
     * Validates the orgNumber.
     *
     * @return boolean
     */
    private static boolean isValid(String personnummer) {
        // Check length
        if (!hasValidLength(personnummer)) {
            return false;
        }
        // Check numeric
        if (!isAllNumeric(personnummer)) {
            return false;
        }
        // Check checkdigit
        if (personnummer.substring(11, 12).equals(String.valueOf(getCheckDigit(personnummer)))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Validates the age of a person. INB_VR0014
     *
     * @return boolean
     */
    public boolean isValidAge() {
        Calendar calpnr = Calendar.getInstance();
        calpnr.setTime(birthDate);
        calpnr.add(Calendar.YEAR, MINIMUM_AGE);

        Date now = new Date();
        Calendar calnow = Calendar.getInstance();
        calnow.setTime(now);

        if (calpnr.getTime().after(calnow.getTime())) {
            return false;
        }
        return true;
    }

    private static Date getBirthDate(final String pNr) {
        String pnr = pNr.substring(0, 8);
        SimpleDateFormat dateFormat = new SimpleDateFormat(I18n.getI18nText("config.date.short"));
        ParsePosition position = new ParsePosition(0);
        return dateFormat.parse(pnr, position);
    }

    public boolean isValidAge(String min, String max) {
        // create a calendar to check against
        Date now = Calendar.getInstance().getTime();

        // test min value if it exist..
        if (min != null) {
            int minValue = Integer.parseInt(min);
            Calendar dateWhenMinOccur = Calendar.getInstance();
            dateWhenMinOccur.setTime(birthDate);
            dateWhenMinOccur.add(Calendar.YEAR, minValue);
            if (dateWhenMinOccur.getTime().after(now)) {
                return false;
            }
        }

        // test max value if it exist..
        if (max != null) {
            int maxValue = Integer.parseInt(max);
            Calendar dateWhenMaxOccur = Calendar.getInstance();
            dateWhenMaxOccur.setTime(birthDate);
            dateWhenMaxOccur.add(Calendar.YEAR, maxValue);
            if (dateWhenMaxOccur.getTime().before(now)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if this orgNumber represents a male.
     *
     * @return true if male, otherwise (female, organisation or incorrect) false
     */
    private static Gender getGender(String personnummer) {
        // if second last number is odd, this is a male
        int tmp = (new Integer(personnummer.substring(10, 11))).intValue();
        if (tmp % 2 == 1) {
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }
    }

    /**
     * Returns personnummer as a String of digits (no hyphen).
     *
     * @return String eg 1212121212
     */
    @Override
    public String toString() {
        return personnummer;
    }

    /**
     * Returns Formatted personnummer with hyphen.
     *
     * @return eg 19121212-1212
     */
    public String formatString() {
        return personnummer.substring(0, 8) + "-" + personnummer.substring(8);
    }

    /**
     * Checks that personnummer contains only numerics.
     *
     * @return boolean
     */
    private static boolean isAllNumeric(final String personnummer) {
        try {
            Long.valueOf(personnummer);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Calculates the checkdigit of the personnummer.
     *
     * @return int
     */
    private static int getCheckDigit(final String personnummer) {
        // First check that format is ok
        if (!hasValidLength(personnummer)) {
            return -1;
        }
        if (!isAllNumeric(personnummer)) {
            return -1;
        }
        // Calculate modulo-sum
        int sum = 0;
        int tmp;
        String pnrTmp = personnummer.substring(2);
        for (int i = 0; i <= 8; i++) {
            tmp = (new Integer(pnrTmp.substring(i, i + 1))).intValue();
            // Double numbers on even positions
            if (i % 2 == 0) {
                tmp = tmp * 2;
            }
            // Increase sum
            sum = sum + (tmp / 10) + (tmp % 10);
        }
        // calculate checkDigit
        int result = 10 - (sum % 10);
        if (result == 10) {
            result = 0;
        }
        return result;
    }

    /**
     * Checks if date part of orgNumber is a correct date.
     *
     * @return boolean
     */
    private static boolean isCompany(final String personnummer) {
        // If shorter than six characters, this cannot be a date
        if (personnummer.length() < 8) {
            return false;
        }
        String birthDate = personnummer.substring(0, 8);
        SimpleDateFormat dateFormat = new SimpleDateFormat(I18n.getI18nText("config.date.short"));
        ParsePosition position = new ParsePosition(0);
        Date date = dateFormat.parse(birthDate, position);
        String tmp = dateFormat.format(date);
        // If birthDate and tmp is equal, the date is correct
        if (!birthDate.equals(tmp)) {
            return false;
        }
        return true;
    }

    /**
     * Parses personnummer. Remove any '-' signs
     */
    private static String parse(final String personnummer) {
        String newPersonnummer = null;
        if (personnummer != null) {
            // remove any "-"-signs
            StringBuffer tmp = new StringBuffer();
            StringTokenizer st = new StringTokenizer(personnummer.trim(), "-");
            while (st.hasMoreTokens()) {
                tmp.append(st.nextToken());
            }
            newPersonnummer = tmp.toString();

            // remove any "+"-signs
            tmp = new StringBuffer();
            st = new StringTokenizer(newPersonnummer.trim(), "+");
            while (st.hasMoreTokens()) {
                tmp.append(st.nextToken());
            }
            newPersonnummer = tmp.toString();

        }

        return newPersonnummer;
    }

    /**
     * Checks that personnummer has correct length.
     *
     * @return boolean
     */
    private static boolean hasValidLength(final String personnummer) {
        if (personnummer == null) {
            return false;
        }
        if (personnummer.length() != 12) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * compares using the toString method
     *
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Personnummer)) {
            return false;
        }
        return this.toString().equals(o.toString());
    }

    @Override
    public int hashCode() {
        return personnummer.hashCode();
    }
}
