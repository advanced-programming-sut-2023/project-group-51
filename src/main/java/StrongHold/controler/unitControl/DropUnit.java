package StrongHold.controler.unitControl;

import StrongHold.model.units.Unit;
import StrongHold.model.worldMap.Map;

public class DropUnit {
    int x, y;
    String type;
    int count;

    public DropUnit(int x, int y, String type, int count) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.count = count;
    }
    public void drop(){
        Map.coordinates[x][y].getPlacedBuilding();
        Unit unit = new Unit();
    }
}
