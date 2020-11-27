package Model;

public class Account {
    private String name;
    private String password;
    private PaymentCard card;

    public Account (String n, String p, PaymentCard c){
        name = n;
        password = p;
        card = c;
    }


}
