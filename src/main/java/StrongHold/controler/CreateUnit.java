package StrongHold.controler;

import StrongHold.model.buildings.Building;
import StrongHold.model.units.Unit;

public class CreateUnit {
    String type;
    int count;

    public CreateUnit(String type, int count) {
        this.type = type;
        this.count = count;
    }
    private void create(){
        Building building = new Building();
        Unit unit = new Unit();
    }
}
