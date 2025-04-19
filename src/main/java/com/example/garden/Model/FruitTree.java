package com.example.garden.Model;

public abstract class FruitTree extends Tree {

    public FruitTree(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    public void bearFruit() {
        System.out.println(getName() + " at (" + getRow() + "," + getCol() + ") is bearing fruit!");
    }

    @Override
    public void seasonalBehavior() {
        bearFruit();
        shedLeaves();
    }

}