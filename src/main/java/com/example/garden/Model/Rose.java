package com.example.garden.Model;

public class Rose extends FlowerPlant {

    private static int count;

    public Rose(int row, int col) {
        super("Rose", 600, 15, row, col, 3);
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count -= 1;
    }
}