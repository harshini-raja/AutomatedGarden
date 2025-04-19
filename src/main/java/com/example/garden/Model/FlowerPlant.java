package com.example.garden.Model;

public abstract class FlowerPlant extends Plant {

    public FlowerPlant(String name, int waterRequirement, int growthTime, int row, int col, int health) {
        super(name, waterRequirement, growthTime, row, col, health);
    }

    // Flower-specific methods can go here
}
