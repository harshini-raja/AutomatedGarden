package com.example.garden.Model;

public class Apple extends FruitTree {

    private static int count;


    public Apple(int row, int col) {
        super("Apple", 2000, 20, row, col, 4);
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count -= 1;
    }
}
