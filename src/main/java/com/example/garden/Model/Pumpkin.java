package com.example.garden.Model;

public class Pumpkin extends VegetableCreeper {

    private static int count;

    public Pumpkin(int row, int col) {
        super("Pumpkin", 650, 20, row, col, 4);
        count++;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}
