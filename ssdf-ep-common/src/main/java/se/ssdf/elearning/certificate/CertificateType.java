package se.ssdf.elearning.certificate;

public interface CertificateType {

    /**
     * Unique id for a specific certificate (internal)
     *
     * @return database id as an int;
     */
    public int getId();

    /**
     * Type is a way to divide certificates into different groups like Instructor or Ad
     *
     * @return a type as a String
     */
    public String getType();
}
