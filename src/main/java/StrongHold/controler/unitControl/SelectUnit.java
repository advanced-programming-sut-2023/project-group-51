package StrongHold.controler.unitControl;

import StrongHold.model.units.Unit;

public class SelectUnit {
    int x1, y1;
    int x2, y2;

    public SelectUnit(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public SelectUnit(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }
    public void select(){
        Unit unit = new Unit();
        SelectedUnits.selectedUnits.add(unit);
    }
    public void move(){}
    public void patrol(){}
}
