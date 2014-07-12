package se.ssdf.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18n {
    private static final ResourceBundle i18n = ResourceBundle.getBundle("i18n", Locale.getDefault());;

    private I18n() {
    }

    public static String getI18nText(String key) {
        return i18n.getString(key);
    }
}
