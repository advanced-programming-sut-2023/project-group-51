package controler;

import model.worldMap.Map;
import model.worldMap.Tile;

public class MapDetails {
    int x, y;

    public MapDetails(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showDetails(){
        Tile tile = Map.coordinates[x][y];
    }
}
