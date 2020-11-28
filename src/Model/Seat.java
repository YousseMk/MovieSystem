package Model;

public class Seat {
    private char row;
    private int col;

    public Seat(char r, int c){
    	row = r;
    	col = c;
    }
    public void setRow(char r) {
    	row = r;
    }
    public String getRow() {
    	return row;
    }
    public void setCol(int c) {
    	col = c;
    }
    public int getCol() {
    	return col;
    }
}
