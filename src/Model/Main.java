package Model;

import View.MovieListView;
import View.SeatView;
import View.ShowtimeList;

public class Main {
    public static void main(String[] args){

        /*SeatView s = new SeatView();
        s.DisplayAvailSeats();*/

        SeatView s = new SeatView();
        MovieTicket t = new MovieTicket();
        t.setMovieName("UP");
        t.setStartTime("4:00");
        t.setEndTime("6:00");
        //t.setTheatreName("Cineplex");
        //t.setNum(1);
        s.DisplayAvailSeats(t);


    }
}
