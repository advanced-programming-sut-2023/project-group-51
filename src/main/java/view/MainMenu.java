package view;

import java.util.regex.Matcher;

public class MainMenu {
    public MainMenu(Matcher matcher){}
    public void run(){
    }
    public void profile(){
        ProfileMenu profileMenu = new ProfileMenu();
    }
    public void game(){
        GameMenu gameMenu = new GameMenu();
        gameMenu.run();
    }
}
