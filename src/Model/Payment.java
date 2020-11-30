package Model;

public class Payment implements Transaction{
    private double amount;

    public Payment(double a, int r, String email){
        this.amount = a;
        performTransaction(r, a, email);
    }

    @Override
    public void performTransaction(int receiptNum, double amount, String email){
        Receipt r = new Receipt(receiptNum, 20.00, email);
    }

}
