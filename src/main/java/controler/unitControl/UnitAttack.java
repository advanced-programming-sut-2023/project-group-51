package controler.unitControl;

public class UnitAttack {
    int x, y;
    String direction;

    public UnitAttack(int x, int y) {
        this.x = x;
        this.y = y;
        SelectedUnits.selectedUnits.add(null);
    }

    public UnitAttack(String direction) {
        this.direction = direction;
    }
    public void pour(){}
    public void dig(){}
}
