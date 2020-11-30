package Model;

import Controllers.BookingController;
import View.*;

import java.awt.*;

public class Main {
    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuestUserView frame = new GuestUserView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
