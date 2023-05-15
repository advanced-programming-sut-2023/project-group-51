package StrongHold.controler.unitControl;

import StrongHold.model.units.Unit;

import java.util.regex.Matcher;

public class ChangeUnitStatus {
    int x, y;
    String status;

    public ChangeUnitStatus(int x, int y, Matcher status) {
        this.x = x;
        this.y = y;
        this.status = status.group();
    }
    public void changeStatus(){
        Unit unit = new Unit();
    }
}
