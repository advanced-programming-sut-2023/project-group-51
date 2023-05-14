package model.buildings;

import model.Governance;
import model.Resources;
import model.User;

import java.util.ArrayList;

public class Building {
    protected Governance empire;
    protected int hp;
    protected int cost;
    protected ArrayList<Resources> goodsToBuild = new ArrayList<>();
    protected int buildingWorkersCount;
    protected int x, y;
}
