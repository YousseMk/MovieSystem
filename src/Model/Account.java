package Model;

public class Account {
    private String username;
    private String password;
    private PaymentCard card;

<<<<<<< Updated upstream
    public Account (String n, String p, PaymentCard c){
        name = n;
        password = p;
        card = c;
=======
    public Account (String username, String password, String card){
        this.username = username;
        this.password = password;
        PaymentCard p = new PaymentCard();
        p.setcNum(card);
        this.card = p;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PaymentCard getCard() {
        return card;
    }

    public void setCard(PaymentCard card) {
        this.card = card;
>>>>>>> Stashed changes
    }


}
