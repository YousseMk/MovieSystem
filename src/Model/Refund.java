package Model;

public abstract class Refund implements Transaction{
    private static double amount = 20.0;

    public Refund(double amount){
        this.amount = amount;

    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(double amount) {
        Refund.amount = amount;
    }
}
