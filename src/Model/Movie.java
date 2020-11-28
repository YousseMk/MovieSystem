package Model;

public class Movie {
	//private Showtime st;
    private String movie;
    private double duration;

    public Movie(String m, double d){
    	movie = m;
    	duration = d;
    } 
    public void setMovie(String m) {
    	movie = m;
    }
    public String getMovie() {
    	return movie;
    }
    public void setDuration(double d) {
    	duration = d;
    }
    public double getDuration() {
    	return duration;  
    }
}
