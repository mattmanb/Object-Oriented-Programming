package edu.barrinm.assign04;

public class CharBoard {
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    private char board[][];

    public CharBoard(int rowCnt, int colCnt, char fillChar) {
        //Set instance data
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        //Allocate new matrix
        board = new char [rowCnt][colCnt];
        //Fill the matrix with fillChar
        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                board[i][j] = fillChar;
            }
        }
    }

    public void clear() {
        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                board[i][j] = fillChar;
            }
        }
    }

    public int getRowCnt() {
        return rowCnt;
    }

    public int getColCnt() {
        return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        if(row < 0 || row >= rowCnt || col < 0 || col >= colCnt) {
            return false;
        }
        return true;
    }

    public char getPos(int row, int col) {
        if(isValidPosition(row, col)) {
            return board[row][col];
        }
        else {
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c) {
        if(isValidPosition(row, col)) {
            board[row][col] = c;
            return true;
        }
        return false;
    }

    public String toString() {
        return rowCnt + " x " + colCnt + " CharBoard (default: " + fillChar + ")";
    }

    public String getMapString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
