package Model;

public class PartialRefund extends Refund {

    public PartialRefund (double amount){
        super(amount);
    }
    double partCredReturn(double payed){
        return 0.85 * payed;
    }
}
