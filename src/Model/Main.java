package Model;
import java.util.ArrayList;
import Controllers.UserController;
import View.LoginView;

public class Main {
    public static void main(String[] args){

        //ArrayList <Theatre> theatres = new ArrayList <Theatre>();

        Login l = new Login();
        User newuser = null;
        newuser = l.login();

        System.out.println(newuser.getEmail());




    }
}
