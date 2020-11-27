package Model;

public class GuestUser extends User{
    private String tempId;

    public GuestUser(String n, String e, String a, String t){
        super(n,e,a);
        tempId = t;

    }

    public void CreateAccount(){

    }
}
