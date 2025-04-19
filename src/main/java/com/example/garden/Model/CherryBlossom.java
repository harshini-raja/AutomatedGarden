package com.example.garden.Model;

public class CherryBlossom extends FlowerTree {

    private static int count;

    public CherryBlossom(int row, int col) {
        super("Cherry Blossom", 800, 20, row, col, 4);
        count++;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}