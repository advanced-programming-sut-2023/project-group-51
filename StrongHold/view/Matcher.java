package view;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GetMatcher {
    public static Matcher getMatcher(String command, String regex){
        Matcher matcher = Pattern.compile(regex).matcher(command);
        return matcher.matches() ? matcher : null;
    }
}
