package StrongHold.controler;

import StrongHold.model.Governance;
import StrongHold.model.User;

import java.util.regex.Matcher;

public class Register {
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String slogan;
    private String answerOfSecurityQuestion;
    private int questionNumber;
    public Register (Matcher matcher){}
    public void action(){
        User user = new User(username, password, nickname, email, slogan, answerOfSecurityQuestion, questionNumber);
        Governance governance = new Governance(user, 0, 0, 0,0 ,0);
        user.setEmpire(governance);
    }

    public boolean checkUsername(){return true;}
    public boolean checkPassword(){return true;}
    public boolean checkNickname(){
        return true;
    }
    public boolean checkEmail(){
        return true;
    }

}
