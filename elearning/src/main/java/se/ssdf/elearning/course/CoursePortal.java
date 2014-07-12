package se.ssdf.elearning.course;

import java.util.Locale;
import java.util.ResourceBundle;

public class CoursePortal {
    private static final ResourceBundle i18n = ResourceBundle.getBundle("i18n", Locale.getDefault());

    private CoursePortal() {
    }

    public static String getI18nText(String key) {
        return i18n.getString(key);
    }
}
