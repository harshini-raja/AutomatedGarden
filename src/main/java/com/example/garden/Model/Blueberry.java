package com.example.garden.Model;

public class Blueberry extends FruitTree {

    private static int count;


    public Blueberry(int row, int col) {
        super("Blueberry", 600, 15, row, col, 3);
        count += 1;
    }

    public int getCount() {
        return count;
    }


    public void decrementCount() {
        count -= 1;
    }
}