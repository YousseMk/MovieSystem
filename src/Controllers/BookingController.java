package Controllers;


import Model.MovieTicket;

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
}
