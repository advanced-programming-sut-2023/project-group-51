package model.units;

import model.Governance;
import model.Sources;

import java.util.ArrayList;

public class Unit {
    protected Governance empire;
    protected int speed;
    protected int hp;
    protected int attackRange;
    protected int cost;
    protected ArrayList<Sources> requirements = new ArrayList<>();
}
