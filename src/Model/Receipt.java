package Model;

import javax.swing.*;

public class Receipt {
    private int receiptNum;
    private double amountPayed;
    private String email;

    public Receipt(int n, double amountPayed, String e){
        this.amountPayed = amountPayed;
        this.receiptNum = n;
        this.email = e;

        System.out.println("Receipt emailed to: ");
        System.out.println(email);
        System.out.println(receiptNum);
        System.out.println(amountPayed);

        String s = "Receipt emailed to: \n" + email + "\n" + receiptNum + "\n" + amountPayed;
        JOptionPane.showMessageDialog(null, s);
    }
}
