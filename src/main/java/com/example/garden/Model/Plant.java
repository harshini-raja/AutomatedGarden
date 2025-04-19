package com.example.garden.Model;

public abstract class Plant {
    private String name;
    private int waterRequirement;
    private int growthTime;
    private int row;
    private int col;
    private int health;

    public Plant(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        this.name = name;
        this.waterRequirement = waterRequirement;
        this.growthTime = growthTime;
        this.row = row;
        this.col = col;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getWaterRequirement() {
        return waterRequirement;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getHealth() {
        return health;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
