package StrongHold.view;

import StrongHold.controler.ChangeTextureStatus;
import StrongHold.controler.CreateUnit;
import StrongHold.controler.DropBuilding;
import StrongHold.controler.SelectBuilding;
import StrongHold.controler.unitControl.*;
import StrongHold.model.worldMap.Map;

import java.util.regex.Matcher;

public class GameMenu {
    Map map = new Map();
    int turns;
    public void run(){}
    public void showMap(){
        MapMenu mapMenu = new MapMenu();
        mapMenu.run();
    }
    public void dropBuilding(int x, int y, String type){
        DropBuilding dropBuilding = new DropBuilding(x, y, type);
    }
    public void selectBuilding(int x, int y){
        SelectBuilding selectBuilding = new SelectBuilding(x, y);
    }
    public void createUnit(String type, int count){
        CreateUnit createUnit = new CreateUnit(type, count);
    }
    public void repair(){}
    public void selectUnit(int x, int y){
        SelectUnit selectUnit = new SelectUnit(x, y);
    }
    public void moveUnit(int x , int y){
        SelectedUnits.selectedUnits.add(null);
        SelectUnit selectUnit = new SelectUnit(x, y);
    }
    public void patrolUnit(int x1, int y1, int x2, int y2){
        SelectedUnits.selectedUnits.add(null);
        SelectUnit selectUnit = new SelectUnit(x1, y1, x2, y2);
    }
    public void setStatus(int x, int y, Matcher matcher){
        ChangeUnitStatus changeUnitStatus = new ChangeUnitStatus(x, y, matcher);
    }
    public void attack(int x, int y){
        SelectedUnits.selectedUnits.add(null);
        UnitAttack unitAttack = new UnitAttack(x, y);
    }
    public void pourOil(String direction){
        SelectedUnits.selectedUnits.add(null);
        UnitAttack unitAttack = new UnitAttack(direction);
    }
    public void digTunnel(int x, int y){
        SelectedUnits.selectedUnits.add(null);
        UnitAttack unitAttack = new UnitAttack(x, y);
    }
    public void buildEquipment(String name){
        BuildEquipment buildEquipment = new BuildEquipment(name);
    }
    public void disband(){
        SelectedUnits.selectedUnits.add(null);
    }
    public void setTexture(int x, int y, String type){
        ChangeTextureStatus changeTextureStatus = new ChangeTextureStatus(x, y, type);
    }
    public void setTexture(int x, int y, int x2, int y2, String type){
        ChangeTextureStatus changeTextureStatus = new ChangeTextureStatus(x, y, x2, y2, type);
    }
    public void clearTexture(int x, int y){
        ChangeTextureStatus changeTextureStatus = new ChangeTextureStatus(x, y);
    }
    public void dropRock(int x, int y, String direction){
        ChangeTextureStatus changeTextureStatus = new ChangeTextureStatus(direction, x, y);
    }
    public void dropTree(int x, int y, String type){
        ChangeTextureStatus changeTextureStatus = new ChangeTextureStatus(x, y, type);
    }
    public void dropUnit(int x, int y, String type, int count){
        DropUnit dropUnit = new DropUnit(x, y, type, count);
    }
    public void enterShopMenu(){
        ShopMenu shopMenu = new ShopMenu();
        shopMenu.run();
    }
    public void enterTradeMenu(){
        TradeMenu tradeMenu = new TradeMenu();
        tradeMenu.run();
    }

    public void showCurrentUserTurn(){
    }
    public void allTurnsPassed(){}
}

