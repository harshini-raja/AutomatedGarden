package com.example.garden.Model;

public class Ivy extends OrnamentalCreeper {

    private static int count;

    public Ivy(int row, int col) {
        super("Ivy", 400, 12, row, col, 3);
        count++;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}
