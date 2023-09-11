package edu.barrinm.assign07;

import edu.barrinm.assign04.CharBoard;
import edu.barrinm.assign06.Creature;

public class Bat extends Creature implements Mover{
    private MoveAlgorithm batMove = new AvoidPlayer();
    public Bat() {}
    public Bat(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }
    public String toString() {
        return "Bat at " + super.getRow() + "," + super.getCol();
    }
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'B');
    }
    public void performMove(Player p) {
        batMove.move(this, p);
    }
}
