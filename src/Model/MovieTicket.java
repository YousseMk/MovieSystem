package Model;

public class MovieTicket {
	private Booking booking;
    private String seatID;
    private String movieName;
    private int tNum;
    private String theatreName;

    public MovieTicket(String s, String m, int n, String tName){
    	booking = new Booking();
    	seatID = s;
    	movieName = m;
    	tNum = n;
    	theatreName = tName;
    }
    public void setBooking(Booking bk) {
    	booking = bk;
    }
    public Booking getBooking() {
    	return booking;
    }
    public void setSeatID(String id) {
    	seatID = id;
    }
    public String getSeatID() {
    	return seatID;
    }
    public void setMovieName(String m) {
    	movieName = m;
    }
    public String getMovieName() {
    	return movieName;
    }
    public void setNum(int t) {
    	tNum = t;
    }
    public int getNum() {
    	return tNum;
    }
    public void setTheatreName(String tn) {
    	theatreName = tn;
    }
    public String getTheatreName() {
    	return theatreName;
}
