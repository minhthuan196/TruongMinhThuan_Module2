package FuramaResort.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    private static Pattern pattern;
    private Matcher matcher;

    public RegexUtil() {
    }

    public boolean validateString(String regex, String regexFormat) {
        pattern = Pattern.compile(regexFormat);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
