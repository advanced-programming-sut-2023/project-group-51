package StrongHold.controler;

import StrongHold.model.worldMap.Tile;

public class ChangeTextureStatus {
    int x2, y2;
    String type;
    String direction;
    int x, y;

    public ChangeTextureStatus(int x, int y, int x2, int y2, String type) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.type = type;
    }

    public ChangeTextureStatus(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ChangeTextureStatus(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void set(){
        Tile tile = new Tile(x, y);
    }
    public void clear(){}

    public ChangeTextureStatus(String direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }
    public void dropRock(){}
    public void dropTree(){}
}
