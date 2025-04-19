package com.example.garden.Model;


public class Mango extends FruitTree {

    private static int count;

    public Mango(int row, int col) {
        super("Mango", 1000, 30, row, col, 5);
        count++;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}
