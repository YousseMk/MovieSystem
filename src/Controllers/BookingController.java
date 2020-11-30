package Controllers;


import Model.GuestUser;
import Model.MovieTicket;
import Model.PaymentCard;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingController {

    public void addBooking(MovieTicket t, int memberid){
        DBController dbc = new DBController();
        String stmt =  "INSERT INTO MovieDatabase.Booking(bookingid, memberid, seatrow, seatcol, moviename, theatrenum, showstart, showend) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps;
        int success;

        try{
            dbc.connectToDB();
            ps = dbc.getCon().prepareStatement(stmt);
            ps.setInt(1, (int) (Math.random() * (999 - 111 + 1) + 111));
            ps.setInt(2, memberid);
            ps.setString(3, Character.toString(t.getSeatID().charAt(0)));
            ps.setString(4, Character.toString(t.getSeatID().charAt(1)));
            ps.setString(5, t.getMovieName());
            ps.setInt(6, t.gettNum());
            ps.setString(7, t.getStartTime());
            ps.setString(8, t.getEndTime());
            success = ps.executeUpdate();
            dbc.disconnectFromDB();

        }catch(SQLException e){
            e.getErrorCode();
        }
    }

    public int addGuestBooking(MovieTicket t, GuestUser g, PaymentCard p){
        DBController dbc = new DBController();
        String stmt =  "INSERT INTO MovieDatabase.BookingforGuest(bookingid, email, seatrow, seatcol, moviename, theatrenum, showstart, showend, cardnum, cvv, exp) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps;
        int success;
        int bookingid = (int) (Math.random() * (999 - 111 + 1) + 111);

        try{
            dbc.connectToDB();
            ps = dbc.getCon().prepareStatement(stmt);
            ps.setInt(1, bookingid);
            ps.setString(2, g.getEmail());
            ps.setString(3, Character.toString(t.getSeatID().charAt(0)));
            ps.setString(4, Character.toString(t.getSeatID().charAt(1)));
            ps.setString(5, t.getMovieName());
            ps.setInt(6, t.gettNum());
            ps.setString(7, t.getStartTime());
            ps.setString(8, t.getEndTime());
            ps.setString(9, p.getcNum());
            ps.setString(10, p.getSecCode());
            ps.setString(11, p.getExp());
            success = ps.executeUpdate();
            dbc.disconnectFromDB();

        }catch(SQLException e){
            e.getErrorCode();
        }

        return bookingid;
    }

    public void GuestCancel(int receiptnum){

        DBController dbc = new DBController();
        String stmt =  "DELETE FROM `MovieDatabase`.`BookingforGuest` WHERE (`bookingid` = ?);";
        PreparedStatement ps;
        int success;

        try{
            dbc.connectToDB();
            ps = dbc.getCon().prepareStatement(stmt);
            ps.setInt(1, receiptnum);
            success = ps.executeUpdate();
            dbc.disconnectFromDB();

        }catch(SQLException e){
            e.getErrorCode();
        }
    }

    public void regCancel(int bookingid){
        DBController dbc = new DBController();
        String stmt =  "DELETE FROM `MovieDatabase`.`Booking` WHERE (`bookingid` = ?);";
        PreparedStatement ps;
        int success;

        try{
            dbc.connectToDB();
            ps = dbc.getCon().prepareStatement(stmt);
            ps.setInt(1, bookingid);
            success = ps.executeUpdate();
            dbc.disconnectFromDB();

        }catch(SQLException e){
            e.getErrorCode();
        }
    }
}
