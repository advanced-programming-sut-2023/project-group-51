package model.worldMap;

import model.buildings.Building;
import model.units.Unit;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    final int xPos, yPos;
    private Building placedBuilding;
    private TileTexture type;
    private ArrayList<Unit> units = new ArrayList<>();
    public Tile(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public Building getPlacedBuilding() {
        return placedBuilding;
    }

    public TileTexture getType() {
        return type;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }
}
