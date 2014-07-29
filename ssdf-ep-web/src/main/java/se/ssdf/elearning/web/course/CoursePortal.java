package se.ssdf.elearning.web.course;

import java.util.Locale;
import java.util.ResourceBundle;

public class CoursePortal {
    private static final ResourceBundle i18n = ResourceBundle.getBundle("i18n", Locale.getDefault());

    public CoursePortal() {
    }

    public static String getI18nText(String key) {
        return i18n.getString(key);
    }
}
