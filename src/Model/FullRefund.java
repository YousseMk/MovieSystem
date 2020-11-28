package Model;

public class FullRefund extends Refund {

    public FullRefund (double amount){
        super(amount);
    }

    double fullCredReturn(double payed){
        return payed;
    }

}
