package edu.barrinm.assign06;

import java.util.Scanner;

public abstract class Creature implements Drawable, Loadable{
    private int currRow = 0, currCol = 0;
    protected Creature() {}
    protected Creature(int row, int col) {
        currRow = row;
        currCol = col;
    }
    public int getRow() {
        return currRow;
    }
    public int getCol() {
        return currCol;
    }
    public void setRow(int row) {
        currRow = row;
    }
    public void setCol(int col) {
        currCol = col;
    }
    public void load(Scanner input) throws GameFileException {
        try{
            currRow = input.nextInt();
            currCol = input.nextInt();
        }
        catch(Exception e) {
            currRow = 0;
            currCol = 0;
            throw new GameFileException("Error loading Creature", e);
        }
    }
}
