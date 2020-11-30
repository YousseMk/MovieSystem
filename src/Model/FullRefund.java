package Model;

public class FullRefund extends Refund {

    public FullRefund (double amount){
        super(amount);
    }

    double fullCredReturn(double payed){
        return payed;
    }

    @Override
    public void performTransaction(int receiptNum, double amount, String email) {
        Receipt r = new Receipt(receiptNum, 20.00, email);

    }
}
