package Controllers;

import Model.RegisteredUser;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserController {
    public void addMember(RegisteredUser u){
        DBController db = new DBController();
        int success;
        try{
            db.connectToDB();
            String stmt = "INSERT INTO MovieDatabase.RegisteredUser(name, email, address, memberid, username, password, cardnum)" +
                    " values (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement s = db.getCon().prepareStatement(stmt);
            s.setString(1, u.getName());
            s.setString(2, u.getEmail());
            s.setString(3, u.getAddress());
            s.setInt(4, u.getMemberid());
            s.setString(5, u.getAccount().getUsername());
            s.setString(6, u.getAccount().getPassword());
            s.setString(7, u.getAccount().getCard().getcNum());

            success = s.executeUpdate();

            db.disconnectFromDB();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void removeMember(RegisteredUser u){
        DBController db = new DBController();
        int success;
        try{
            db.connectToDB();
            String stmt = "DELETE FROM MovieDatabase.RegisteredUser R WHERE R.memberid=?;";

            PreparedStatement s = db.getCon().prepareStatement(stmt);
            s.setInt(1, u.getMemberid());

            success = s.executeUpdate();

            db.disconnectFromDB();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
