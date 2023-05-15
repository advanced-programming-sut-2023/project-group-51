package StrongHold.controler;

import StrongHold.model.buildings.Building;
import StrongHold.model.worldMap.Map;

public class DropBuilding {
    int x, y;
    String type;

    public DropBuilding(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public void dropBuilding(){
        Map.coordinates[x][y].getPlacedBuilding();
        Building building = new Building()
                ;
    }
}
