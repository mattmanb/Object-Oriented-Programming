package edu.barrinm.assign07;

import edu.barrinm.assign06.Creature;

public class SeekPlayer implements MoveAlgorithm{
    public void move(Creature current, Player p) {
        int rowDist = p.getRow() - current.getRow();
        int colDist = p.getCol() - current.getCol();
        if(colDist == 0 && rowDist == 0) {
            return;
        }
        if(rowDist != 0 || colDist != 0) {
            if(Math.abs(rowDist) > Math.abs(colDist)) {
                if(rowDist < 0) {
                    //Creature moves up
                    current.setRow(current.getRow()-1);
                }
                else {
                    //Creature moves down
                    current.setRow(current.getRow()+1);
                }
            }
            else {
                if(colDist < 0) {
                    //Creature moves left
                    current.setCol(current.getCol()-1);
                }
                else {
                    //Creature moves right
                    current.setCol(current.getCol()+1);
                }
            }
        }
    }
}
