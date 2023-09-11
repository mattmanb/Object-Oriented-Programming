package edu.barrinm.assign07;

import edu.barrinm.assign04.CharBoard;
import edu.barrinm.assign06.Creature;

public class Player extends Creature {
    public Player(){}
    public Player(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }
    public String toString() {
        return "Player at " + super.getRow() + "," + super.getCol();
    }
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'P');
    }
}
