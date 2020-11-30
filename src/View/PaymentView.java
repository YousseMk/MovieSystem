package View;
import Controllers.BookingController;
import Model.*;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PaymentView extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField emailField;
    private JTextField cardNumberField;
    private JTextField cvvField;
    private JTextField expDateField;
    private JTextField nameField;
    JButton btnNewButton;

    MovieTicket t;
    int id;


    public PaymentView(MovieTicket t, int id) {

        this.t = t;
        this.id = id;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnNewButton = new JButton("Pay and Finish");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(540, 339, 137, 23);
        contentPane.add(btnNewButton);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEmail.setBounds(108, 126, 69, 14);
        contentPane.add(lblEmail);

        emailField = new JTextField();
        emailField.setColumns(10);
        emailField.setBounds(239, 124, 187, 20);
        contentPane.add(emailField);

        JLabel lblPaymentInformation = new JLabel("Payment information");
        lblPaymentInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPaymentInformation.setBounds(108, 185, 137, 14);
        contentPane.add(lblPaymentInformation);

        JLabel lblCardNumber = new JLabel("Card Number");
        lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCardNumber.setBounds(108, 210, 137, 14);
        contentPane.add(lblCardNumber);

        cardNumberField = new JTextField();
        cardNumberField.setColumns(10);
        cardNumberField.setBounds(239, 210, 137, 20);
        contentPane.add(cardNumberField);

        JLabel lblExpirationDate = new JLabel("Expiration Date (mm/yyyy)");
        lblExpirationDate.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblExpirationDate.setBounds(409, 274, 167, 14);
        contentPane.add(lblExpirationDate);

        JLabel lblCcv = new JLabel("CCV");
        lblCcv.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblCcv.setBounds(108, 274, 33, 14);
        contentPane.add(lblCcv);

        cvvField = new JTextField();
        cvvField.setColumns(10);
        cvvField.setBounds(239, 272, 55, 20);
        contentPane.add(cvvField);

        expDateField = new JTextField();
        expDateField.setColumns(10);
        expDateField.setBounds(586, 272, 68, 20);
        contentPane.add(expDateField);

        JLabel lblCreateAccount = new JLabel("Make Payment");
        lblCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblCreateAccount.setBounds(108, 24, 208, 28);
        contentPane.add(lblCreateAccount);

        nameField = new JTextField();
        nameField.setColumns(10);
        nameField.setBounds(239, 63, 137, 20);
        contentPane.add(nameField);

        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblName.setBounds(108, 67, 69, 14);
        contentPane.add(lblName);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnNewButton) {
            try {
                //!!!!!!!!!!!!database!!!!!!!!!!!!!!!!!!!
                //nameField, emailField, cardNumberField, cvvField, expDateField

                JOptionPane.showMessageDialog(null, "Payment Successfully");
                if (true) {
                    GuestUser g = new GuestUser(nameField.getText(), emailField.getText(), "", "0");
                    PaymentCard p = new PaymentCard(cardNumberField.getText(), expDateField.getText(), cvvField.getText());
                    BookingController b = new BookingController();
                    int receiptNum = b.addGuestBooking(t, g, p);
                    Payment payment = new Payment(20.00, receiptNum, emailField.getText());
                    GuestUserView guest = new GuestUserView();
                    guest.setVisible(true);
                    dispose();
                }
                //else {
                //	JOptionPane.showMessageDialog(null, "Payment failed");
                //}

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
        }
    }
}