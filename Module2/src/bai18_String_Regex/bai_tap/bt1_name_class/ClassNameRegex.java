package bai18_String_Regex.bai_tap.bt1_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^(C|A|P)+([0-9]{4})+(G|H|I|K)$";

    public ClassNameRegex() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
