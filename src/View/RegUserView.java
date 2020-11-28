package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class RegUserView extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public RegUserView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Browse Movies");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //!!!!!!!!!!!!!!!!!!!!!
                //Browse Movies(I will add later)!!!!!!!!!!
                //!!!!!!!!!!!!!!!!!!
            }
        });
        btnNewButton.setBounds(300, 175, 200, 55);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Cancel Tickets");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegCancelView cancel = new RegCancelView();
                cancel.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setBounds(300, 265, 200, 55);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Logout");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuestUserView guest = new GuestUserView();
                guest.setVisible(true);
                dispose();
            }
        });
        btnNewButton_2.setBounds(677, 50, 80, 23);
        contentPane.add(btnNewButton_2);

        JLabel lblNewLabel = new JLabel("Movie Theater Ticket Reservation App");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.black);
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
        lblNewLabel.setBounds(183, 34, 421, 45);
        contentPane.add(lblNewLabel);
    }

}
