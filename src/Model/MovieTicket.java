package Model;

public class MovieTicket {
    private String seatID;
    private String movieName;
    private int tNum;
    private String theatreName;
    private String startTime;
    private String endTime;

    public MovieTicket(String s, String m, int n, String tName){
    	//booking = new Booking();
    	seatID = s;
    	movieName = m;
    	tNum = n;
    	theatreName = tName;
    }

    public MovieTicket(){

    }

    public int gettNum() {
        return tNum;
    }

    public void settNum(int tNum) {
        this.tNum = tNum;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
}
