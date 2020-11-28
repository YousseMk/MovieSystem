package Controllers;

import Model.Account;
import Model.RegisteredUser;
import Model.User;
import View.LoginView;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    public void showLoginScreen(){
        //calls the login view function
    }

    /*
    public User attemptLogin(){
        //the view will prompt user for username and password
        //the program will check the database for a user with the provided username and password
        //if the username or password is unavailable, error message will be displayed else we log them in
        LoginView lv = new LoginView();
        lv.displayLogin();


        System.out.println("DONE");
        String username = lv.getU();
        String password = lv.getP();
        DBController db = new DBController();
        ResultSet rs;
        RegisteredUser returnedUser = null;


        try {

                db.connectToDB();
                String stmt = "select * from RegisteredUser R where R.username=? and R.password = ?;";

                PreparedStatement s = db.getCon().prepareStatement(stmt);
                s.setString(1, username);
                s.setString(2, password);
                rs = s.executeQuery();

                while(rs.next()) {
                    Account userAccount = new Account(rs.getString(5), rs.getString(6), rs.getString(7));

                    returnedUser = new RegisteredUser(rs.getString(1), rs.getString(2), rs.getString(3),
                            userAccount, rs.getInt(4));

                    db.disconnectFromDB();
                    return returnedUser;
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        return returnedUser;
    }
    */
}
