package View;

import Controllers.LoginController;
import Model.RegisteredUser;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class LoginView extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton btnNewButton;

    /**
     * Create the frame.
     */
    public LoginView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("UserName");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(125, 68, 69, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(125, 129, 69, 14);
        contentPane.add(lblNewLabel_1);

        usernameField = new JTextField();
        usernameField.setBounds(255, 65, 115, 20);
        contentPane.add(usernameField);
        usernameField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(255, 126, 115, 20);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(204, 194, 115, 23);
        contentPane.add(btnNewButton);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnNewButton) {

            String username = usernameField.getText();
            String password = passwordField.getText();
            LoginController lc = new LoginController();
            RegisteredUser r = (RegisteredUser) lc.attemptLogin(username, password);
            r.showHome();
            dispose();

        }
    }
}


/*
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

*/
