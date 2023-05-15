package controler;

import model.User;

import java.util.regex.Matcher;

public class ResetPassword {
    public ResetPassword(Matcher matcher){}
    public boolean checkQuestionAnswer(){
        User.getUsers().get(null).passwordMatch();
        return true;
    }

}
