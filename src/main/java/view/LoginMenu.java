package view;

import controler.Login;
import controler.Register;
import controler.ResetPassword;

import java.util.regex.Matcher;

public class LoginMenu {
    public void run(){}
    public void register(Matcher matcher){
        Register register = new Register(matcher);
    }
    public void login(Matcher matcher){
        Login login = new Login(matcher);
        MainMenu mainMenu = new MainMenu(matcher);
        mainMenu.run();
    }
    public void resetPassword(Matcher matcher){
        ResetPassword resetPassword = new ResetPassword(matcher);
    }
}
