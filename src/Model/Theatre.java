package Model;

public class Theatre {

	  private String name;
    private Seat seatGrid; //array?
    private int tNum;
    private int cap;

    public Theatre(int num, int c, String n){
    	seatGrid = new Seat();
    	tNum = num;
    	cap = c;
    	name = n;
    }
    public void setName(String n) {
    	name = n;
    }
    public String getName() {
    	return name;
    }
    public Seat getSeatGrid() {
    	return seatGrid;
    }
    public void setSeatGrid(Seat sg) {
    	seatGrid = sg;
    }
}
