package bai18_String_Regex.bai_tap.bt2_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX = "^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$";

    public PhoneRegex() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
