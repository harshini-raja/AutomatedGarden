package com.example.garden.Model;

public class GrapeVine extends Creepers {

    private static int count;

    public GrapeVine(int row, int col) {
        super("Grape Vine", 700, 18, row, col, 4);
        count++;
    }

    @Override
    public void seasonalBehavior() {
        System.out.println(getName() + " at (" + getRow() + "," + getCol() + ") is bearing grapes and climbing the trellis!");
        spread();
    }

    public int getCount() {
        return count;
    }

    public void decrementCount() {
        count--;
    }
}
