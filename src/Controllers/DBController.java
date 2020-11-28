package Controllers;

//username is root
//password is password

import java.sql.*;


public class DBController {

    private Connection con = null;

    public void connectToDB(){

        try{
            String url = "jdbc:mysql://localhost:3306";
            String url = "jdbc:mysql://localhost:3306/MovieDatabase";
            con = DriverManager.getConnection(url, "root", "password");

            System.out.println("connected to the db!");
        }
        catch(SQLException e){
            throw new Error("problem connecting to database", e);
        }
    }

    public void disconnectFromDB(){
        try{
            if(con != null){
                con.close();
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
