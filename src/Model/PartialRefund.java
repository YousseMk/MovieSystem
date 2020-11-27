package Model;

public class PartialRefund extends Refund {

    double partCredReturn(double payed){
        return 0.85 * payed;
    }
}
