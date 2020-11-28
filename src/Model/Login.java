package Model;

import Controllers.LoginController;
import View.LoginView;

public class Login {


    public User login() {

        LoginController lc = new LoginController();
        RegisteredUser tobeDeterminied = null;

        tobeDeterminied = (RegisteredUser) lc.attemptLogin();


        return tobeDeterminied;
    }
}





