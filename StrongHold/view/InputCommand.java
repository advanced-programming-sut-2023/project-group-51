package view;

import java.util.regex.Matcher;

public class InputCommand {
    private String regex;
    public InputCommand(String regex){
        this.regex = regex;
    }
    private Matcher getMatcher(String input){
        return GetMatcher.getMatcher(input, regex);
    }
}
