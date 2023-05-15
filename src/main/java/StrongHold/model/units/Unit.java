package StrongHold.model.units;

import StrongHold.model.Governance;
import StrongHold.model.Sources;

import java.util.ArrayList;

public class Unit {
    protected Governance empire;
    protected int speed;
    protected int hp;
    protected int attackRange;
    protected int cost;
    protected ArrayList<Sources> requirements = new ArrayList<>();
}
