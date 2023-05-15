package model;

import model.buildings.Building;
import model.units.Unit;

import java.util.ArrayList;

public class Governance {
    User owner;
    private int maxPopulation;
    private int currentPopulation;
    private int troops;
    private int workers;
    private String[] popularityFactors = {"Food", "Tax", "Religion", "Fear"};
    private int foodRate;
    private int taxRate;
    private int religionRate;
    private int fearRate;
    private int popularity;
    private int gold;
    private ArrayList<Resources> foods = new ArrayList<>();
    private ArrayList<Building> buildings = new ArrayList<>();
    private ArrayList<Unit> units = new ArrayList<>();

    public Governance(){}
    public Governance(User owner, int foodRate, int taxRate, int fearRate, int popularity, int gold) {
        this.owner = owner;
        this.foodRate = foodRate;
        this.taxRate = taxRate;
        this.fearRate = fearRate;
        this.popularity = popularity;
        this.gold = gold;
    }

    public User getOwner() {
        return owner;
    }

    public String[] getPopularityFactors() {
        return popularityFactors;
    }

    public int getFoodRate() {
        return foodRate;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public int getReligionRate() {
        return religionRate;
    }

    public int getFearRate() {
        return fearRate;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getGold() {
        return gold;
    }

    public ArrayList<Resources> getFoodTypes() {
        return foods;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setFoodRate(int foodRate) {
        this.foodRate = foodRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public void setReligionRate(int religionRate) {
        this.religionRate = religionRate;
    }

    public void setFearRate(int fearRate) {
        this.fearRate = fearRate;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void addFood(){
    }
    public void addUnit(){}
    public void addBuilding(){}

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getTroops() {
        return troops;
    }

    public void setTroops(int troops) {
        this.troops = troops;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }
}
