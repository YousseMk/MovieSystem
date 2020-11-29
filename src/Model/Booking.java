package Model;

import Controllers.BookingController;

public class Booking {
    int bookingnum;
    private MovieTicket ticket;
    private Receipt receipt;

    public Booking (MovieTicket t, Receipt r) {
        ticket = t;
        receipt =r;
    }

    public Booking(){
        BookingController bc = new BookingController();;
    }

    public void giveRefund() {

    }

    /*public void selectTheatre(){
        BookingController bc = new BookingController();
        bc.selectTheatre(ticket);
    }

    public void selectMovie(){
        BookingController bc = new BookingController();
        bc.selectMovie(ticket);
    }

    public void selectShowtime(){
        BookingController bc = new BookingController();
        bc.selectShowtime(ticket);
    }

    public void selectSeat(){
        BookingController bc = new BookingController();
        bc.selectSeat(ticket);
    }*/


}
