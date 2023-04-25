package edu.barrinm.assign07;

import edu.barrinm.assign04.CharBoard;
import edu.barrinm.assign06.Creature;

public class Orc extends Creature implements Mover {
    private MoveAlgorithm orcMove = new SeekPlayer();
    public Orc() {}
    public Orc(int row, int col) {
        super.setRow(row);
        super.setCol(col);
    }
    public String toString() {
        return "Orc at " + super.getRow() + "," + super.getCol();
    }
    public void draw(CharBoard map) {
        map.setPos(super.getRow(), super.getCol(), 'O');
    }
    public void performMove(Player p) {
        orcMove.move(this, p);
    }
}
