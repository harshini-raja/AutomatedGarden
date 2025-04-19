package com.example.garden.Model;

public abstract class Creepers extends Plant{
    public Creepers(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    public void spread() {
        System.out.println(getName() + " at (" + getRow() + "," + getCol() + ") is spreading along the ground or support.");
    }

    public abstract void seasonalBehavior();
}
