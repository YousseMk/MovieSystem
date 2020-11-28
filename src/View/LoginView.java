package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView implements ActionListener {

        JFrame loginFrame;
        JPanel panel;
        JTextField user;
        JPasswordField pass;
        JButton accCreate, contAsGuest, submit;
        JLabel username, password;

        String u;
        String p;
        int guestOrCreate = 0;
        boolean recieved = false;


    public void displayLogin(){

        loginFrame = new JFrame("Welcome to MovieBooking");
        panel = new JPanel(new GridLayout(4,1));
        user = new JTextField();
        //user.
        pass = new JPasswordField();
        accCreate = new JButton("Sign up");
        contAsGuest = new JButton("Continue as guest");
        username = new JLabel("Username: ");
        password = new JLabel("Password: ");
        submit = new JButton("Submit");

        panel.add(username);
        panel.add(user);
        panel.add(password);
        panel.add(pass);
        panel.add(new JLabel());
        panel.add(submit);
        panel.add(accCreate);
        panel.add(contAsGuest);

        submit.addActionListener(this);
        accCreate.addActionListener(this);
        contAsGuest.addActionListener(this);


        loginFrame.add(panel);

        loginFrame.setSize(300,300);
        loginFrame.setDefaultCloseOperation(3);
        loginFrame.setVisible(true);

        while(recieved == false) {}




    }

    public String getU(){
        return u;
    }

    public String getP(){
        return p;
    }

    public boolean getRecieved(){
        return recieved;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == submit){
            u = user.getText();
            p = pass.getText();
            System.out.println(u + " " + p);
            recieved = true;

        }else if (e.getSource() == contAsGuest){
            guestOrCreate = 1;
            recieved = true;

        }else if(e.getSource() == accCreate){
            guestOrCreate = 2;
            recieved = true;
        }
    }
}
