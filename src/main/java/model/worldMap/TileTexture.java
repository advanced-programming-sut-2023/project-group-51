package model.worldMap;

public enum TileTexture {
    EARTH_AND_STONES(true, true, false),
    SCRUB(true, true, false),
    IRON(true, true, false),
    ROCKS(false, false, false),
    EARTH(true, true, false),
    BOULDERS(true, true, false),
    THICK_SCRUB(true, true, false),
    GRASS(true, true, true),
    MARSH(true, false, false),
    SMALL_POND(false, false, false),
    LARGE_POND(false, false, false),
    RIVER(false, false, false),
    FORD(true, false, false),
    OIL(true, false, false),
    BEACH(true, true, false),
    SEA (false, false, false);
    private final boolean walkAbility;
    private final boolean buildAbility;
    private final boolean fertileAbility;

    TileTexture(boolean walkAbility, boolean buildAbility, boolean fertileAbility) {
        this.walkAbility = walkAbility;
        this.buildAbility = buildAbility;
        this.fertileAbility = fertileAbility;
    }

    public boolean isWalkAbility() {
        return walkAbility;
    }

    public boolean isBuildAbility() {
        return buildAbility;
    }

    public boolean isFertileAbility() {
        return fertileAbility;
    }
}
