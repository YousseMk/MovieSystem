package Model;

import java.util.Date;

public class PaymentCard {
    private String cNum;
    private String exp;
    private String secCode;

    public PaymentCard(String c, String e, String s){
        this.cNum = c;
        this.exp = e;
        this.secCode = s;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }
}
