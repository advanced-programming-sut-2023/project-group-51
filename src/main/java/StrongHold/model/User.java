package StrongHold.model;

import java.util.HashMap;

public class User {
    private static HashMap<String, User> users = new HashMap<>();
    private Governance empire;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String slogan;
    private String answerOfSecurityQuestion;
    private int questionNumber;
    private int rank;
    private int highScore;
    public User(){}

    public User(String username, String password, String nickname, String email, String slogan, String answerOfSecurityQuestion, int questionNumber) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.slogan = slogan;
        this.answerOfSecurityQuestion = answerOfSecurityQuestion;
        this.questionNumber = questionNumber;
    }
    public void changePassword(){}
    public void changeNickname(){}
    public void chaneEmail(){}
    public void changeSlogan(){}
    public void removeSlogan(){}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getSlogan() {
        return slogan;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public int getRank() {
        return rank;
    }

    public int getHighScore() {
        return highScore;
    }
    public boolean passwordMatch(){
        return false;
    }
    public boolean answerMatch(){
        return false;
    }

    public static HashMap<String, User> getUsers() {
        return users;
    }

    public Governance getEmpire() {
        return empire;
    }

    public void setEmpire(Governance empire) {
        this.empire = empire;
    }
}
