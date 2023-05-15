package controler;

import model.buildings.Building;
import model.worldMap.Map;

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
