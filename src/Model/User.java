package Model;
import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String address;
    private ArrayList<Booking> bookings;

    public User(String n, String e, String a){
        this.name = n;
        this. email = e;
        this.address = a;
        bookings = new ArrayList<Booking>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    /*book(){
        Booking b = new Booking();

        b.selectTheatre();
        b.selectMovie();
        b.selectShowTime();
        b.selectSeat();

    }*/
}
