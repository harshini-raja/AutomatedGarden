package com.example.garden.Model;

public abstract class Tree extends Plant {

    public Tree(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    public void shedLeaves() {
        System.out.println(getName() + " at (" + getRow() + "," + getCol() + ") is shedding leaves.");
    }

    public abstract void seasonalBehavior();

}