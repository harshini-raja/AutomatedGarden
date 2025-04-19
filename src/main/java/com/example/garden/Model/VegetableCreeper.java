package com.example.garden.Model;

public abstract class VegetableCreeper extends Creepers {

    public VegetableCreeper(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    @Override
    public void seasonalBehavior() {
        System.out.println(getName() + " (vegetable creeper) at (" + getRow() + "," + getCol() + ") is producing veggies!");
        spread();
    }
}
