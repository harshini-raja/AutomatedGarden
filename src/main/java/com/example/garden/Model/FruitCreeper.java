package com.example.garden.Model;

public abstract class FruitCreeper extends Creepers {

    public FruitCreeper(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    @Override
    public void seasonalBehavior() {
        System.out.println(getName() + " (fruit creeper) at (" + getRow() + "," + getCol() + ") is growing fruits!");
        spread();
    }
}
