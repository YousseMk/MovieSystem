package Model;

public class PartialRefund extends Refund {

    public PartialRefund (int receiptNum, double amount, String email){

        super(amount);
        performTransaction(receiptNum, amount, email);
    }


    double partCredReturn(){
        return 0.85 * getAmount();
    }

    @Override
    public void performTransaction(int receiptNum, double amount, String email) {
        Receipt r = new Receipt(receiptNum, partCredReturn(), email);

    }
}
