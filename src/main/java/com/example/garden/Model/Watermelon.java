package com.example.garden.Model;

public class Watermelon extends FruitCreeper {

    private static int count;

    public Watermelon(int row, int col) {
        super("Watermelon", 750, 25, row, col, 4);
        count++;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}
