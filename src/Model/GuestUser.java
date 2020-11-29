package Model;

import Controllers.UserController;

public class GuestUser extends User{
    private String tempId;

    public GuestUser(String n, String e, String a, String t){
        super(n,e,a);
        tempId = t;
    }

    // this function will need to be passed the information read from the View section
    public void CreateAccount(String Username, String Password, String card){
        /*UserController Ucontroller= new UserController();
        // this function will prompt the user to enter a
        // username and password using a GUI screen.
        // first create new account, then create the registered user
        // then call addMember from UserController.
        // we will maybe have a Global variable for MemberID, that we can simply increase it for
        // each new member, not having to worry about copies.
        int NewID = (int)Math.random();         // change this later.
        Account a = new Account(Username,Password,card);
        RegisteredUser newReg = new RegisteredUser(this.getName(), this.getEmail(), this.getAddress(), a, NewID);
        // add this user into the database
        Ucontroller.addMember(newReg);*/
    }
}
