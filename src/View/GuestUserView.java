package View;

import java.awt.Color;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GuestUserView extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application (temp main function to test classes)
     */
    public static void main(String[] args) {
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

    /**
     * Create the frame.
     */
    public GuestUserView() {
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
                GuestCancelView cancel = new GuestCancelView();
                cancel.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setBounds(300, 265, 200, 55);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Create Account");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    CreateAccountView create = new CreateAccountView();
                    create.setVisible(true);
                    dispose();
                }catch(Exception e1){
                    JOptionPane.showMessageDialog(null, e1);
                }
            }
        });
        btnNewButton_2.setBounds(300, 356, 200, 55);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Login");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginView login = new LoginView();
                login.setVisible(true);
                dispose();
            }
        });
        btnNewButton_3.setBounds(677, 50, 80, 23);
        contentPane.add(btnNewButton_3);

        JLabel lblNewLabel = new JLabel("Movie Theater Ticket Reservation App");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.black);
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
        lblNewLabel.setBounds(183, 34, 421, 45);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Home Page");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setForeground(Color.DARK_GRAY);
        lblNewLabel_1.setBackground(Color.WHITE);
        lblNewLabel_1.setBounds(360, 90, 94, 23);
        contentPane.add(lblNewLabel_1);
    }

}
