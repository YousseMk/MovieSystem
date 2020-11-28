package Model;

import java.sql.Time;
import java.util.Date;

public class ShowTime {
    private Date date;
    private Time start;
    private Time end;
    private Movie movie;
    private Theatre theatre;
    
    public ShowTime (Date d, Time s, Time e, Movie m, Theatre t) {
    	date = d;
    	start = s;
    	end = e;
    	movie = m;
    	theatre = t;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
}
