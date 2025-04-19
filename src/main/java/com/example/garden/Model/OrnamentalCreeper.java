package com.example.garden.Model;

public abstract class OrnamentalCreeper extends Creepers {

    public OrnamentalCreeper(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    @Override
    public void seasonalBehavior() {
        System.out.println(getName() + " (ornamental) at (" + getRow() + "," + getCol() + ") is flourishing beautifully.");
        spread();
    }
}
