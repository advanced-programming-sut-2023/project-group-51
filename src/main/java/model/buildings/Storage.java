package model.buildings;

import model.Resources;

import java.util.HashMap;

public class Storage extends Building {
    private int capacity;
    private HashMap<Resources, Integer> existGoods;
}
