package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateAccountView extends JFrame {

    private JPanel contentPane;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField conPasswordField;
    private JTextField emailField;
    private JTextField addressField;
    private JTextField cardNumberField;
    private JTextField cvvField;
    private JTextField expDateField;

    /**
     * Create the frame.
     */
    public CreateAccountView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("User Name");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(108, 63, 69, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(108, 199, 69, 14);
        contentPane.add(lblNewLabel_1);

        usernameField = new JTextField();
        usernameField.setBounds(239, 61, 167, 20);
        contentPane.add(usernameField);
        usernameField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(239, 197, 115, 20);
        contentPane.add(passwordField);

        JButton btnNewButton = new JButton("Create Account");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    //!!!!!!!!!!!!Connect database!!!!!!!!!!!!!!!!!!!
                    //check usernameField.getText()
                    //check passwordField.getText()
                    //conPasswordField, emailField, addressField, cardNumberField, cvvField, expDateField
                    //add an account with the above info
                    //!!!!!!!!!!!!!!!!!!!!
                    JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    if (true) {
                        GuestUserView guest = new GuestUserView();
                        guest.setVisible(true);
                        dispose();
                    }
                    //else {
                    //	JOptionPane.showMessageDialog(null, "Login info incorrect");
                    //}

                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null, e1);
                }
            }
        });
        btnNewButton.setBounds(554, 455, 137, 23);
        contentPane.add(btnNewButton);

        conPasswordField = new JPasswordField();
        conPasswordField.setBounds(544, 197, 115, 20);
        contentPane.add(conPasswordField);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEmail.setBounds(108, 126, 69, 14);
        contentPane.add(lblEmail);

        emailField = new JTextField();
        emailField.setColumns(10);
        emailField.setBounds(239, 124, 167, 20);
        contentPane.add(emailField);

        JLabel lblReenterPassword = new JLabel("Confirm Password");
        lblReenterPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblReenterPassword.setBounds(413, 199, 121, 14);
        contentPane.add(lblReenterPassword);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAddress.setBounds(108, 274, 69, 14);
        contentPane.add(lblAddress);

        addressField = new JTextField();
        addressField.setColumns(10);
        addressField.setBounds(239, 272, 318, 20);
        contentPane.add(addressField);

        JLabel lblPaymentInformation = new JLabel("Payment information");
        lblPaymentInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPaymentInformation.setBounds(108, 332, 137, 14);
        contentPane.add(lblPaymentInformation);

        JLabel lblCardNumber = new JLabel("Card Number");
        lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCardNumber.setBounds(108, 357, 137, 14);
        contentPane.add(lblCardNumber);

        cardNumberField = new JTextField();
        cardNumberField.setColumns(10);
        cardNumberField.setBounds(239, 355, 137, 20);
        contentPane.add(cardNumberField);

        JLabel lblExpirationDate = new JLabel("Expiration Date (mm/yyyy)");
        lblExpirationDate.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblExpirationDate.setBounds(413, 357, 167, 14);
        contentPane.add(lblExpirationDate);

        JLabel lblCcv = new JLabel("CCV");
        lblCcv.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCcv.setBounds(108, 416, 33, 14);
        contentPane.add(lblCcv);

        cvvField = new JTextField();
        cvvField.setColumns(10);
        cvvField.setBounds(239, 414, 55, 20);
        contentPane.add(cvvField);

        expDateField = new JTextField();
        expDateField.setColumns(10);
        expDateField.setBounds(591, 355, 68, 20);
        contentPane.add(expDateField);

        JLabel lblCreateAccount = new JLabel("Create Account");
        lblCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblCreateAccount.setBounds(108, 24, 208, 28);
        contentPane.add(lblCreateAccount);
    }
}
