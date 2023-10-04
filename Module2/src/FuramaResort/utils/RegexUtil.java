package FuramaResort.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public RegexUtil() {
    }

    public boolean validateString(String regex, String regexFormat) {
        Pattern pattern = Pattern.compile(regexFormat);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
