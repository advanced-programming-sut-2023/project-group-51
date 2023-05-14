package view;

import controler.MapDetails;

public class MapMenu {
    public void run(){}
    public void moveUp(){}
    public void moveDown(){
    }
    public void moveLeft(){}
    public void moveRight(){}
    public void showDetails(int x, int y){
        MapDetails mapDetails = new MapDetails(x, y);
    }
}
