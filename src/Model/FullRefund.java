package Model;

public class FullRefund extends Refund {

    public FullRefund (int id, double amount, String email)
    {
        super(amount);
        performTransaction(id, amount, email);
    }

    double fullCredReturn(){
        return getAmount();
    }

    @Override
    public void performTransaction(int receiptNum, double amount, String email) {
        Receipt r = new Receipt(receiptNum, fullCredReturn(), email);

    }
}
