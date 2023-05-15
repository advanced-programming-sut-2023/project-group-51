package StrongHold.controler.unitControl;

import StrongHold.model.units.Unit;

import java.util.ArrayList;

public class SelectedUnits {
    public static ArrayList<Unit> selectedUnits = new ArrayList<>();
    public static void makeNew(){
        selectedUnits.clear();
    }
}
