package View;

import Controllers.BookingController;
import Model.PartialRefund;
import Model.Refund;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GuestCancelView extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField receiptNumField;
    JButton btnNewButton;

    /**
     * Create the frame.
     */
    public GuestCancelView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Receipt Number");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(125, 68, 97, 14);
        contentPane.add(lblNewLabel);

        receiptNumField = new JTextField();
        receiptNumField.setBounds(255, 65, 123, 20);
        contentPane.add(receiptNumField);
        receiptNumField.setColumns(10);

        btnNewButton = new JButton("Cancel");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(222, 139, 115, 23);
        contentPane.add(btnNewButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNewButton)
            try {

                JOptionPane.showMessageDialog(null, "Movie Cancelled Successfully");
                if (true) {
                    BookingController b = new BookingController();
                    int receiptnum = Integer.parseInt(receiptNumField.getText());
                    b.GuestCancel(receiptnum);
                    Refund r = new PartialRefund(receiptnum, 20.00, "Thank you");
                    GuestUserView guest = new GuestUserView();
                    guest.setVisible(true);
                    dispose();
                }
                //else {
                //	JOptionPane.showMessageDialog(null, "cancel failed");
                //}

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
    }
}

