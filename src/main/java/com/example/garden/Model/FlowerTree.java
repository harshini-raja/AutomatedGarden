package com.example.garden.Model;

public abstract class FlowerTree extends Tree {

    public FlowerTree(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    public void bloom() {
        System.out.println(getName() + " at (" + getRow() + "," + getCol() + ") is blooming!");
    }

    @Override
    public void seasonalBehavior() {
        bloom();
        shedLeaves();
    }

}