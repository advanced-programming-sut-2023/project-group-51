package controler.unitControl;

import model.units.Unit;

import java.util.ArrayList;

public class SelectedUnits {
    public static ArrayList<Unit> selectedUnits = new ArrayList<>();
    public static void makeNew(){
        selectedUnits.clear();
    }
}
