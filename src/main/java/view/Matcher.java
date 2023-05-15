package view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetMatcher {
    public static Matcher getMatcher(String command, String regex){
        Matcher matcher = Pattern.compile(regex).matcher(command);
        return matcher.matches() ? matcher : null;
    }
}
