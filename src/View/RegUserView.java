package View;

import Model.MovieTicket;
import Model.RegisteredUser;

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

public class RegUserView extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JButton btnNewButton, btnNewButton_1, btnNewButton_2;
    private RegisteredUser u;

    /**
     * Create the frame.
     */
    public RegUserView(RegisteredUser user) {
        super("Welcome " + user.getName() + " (" + user.getMemberid() + ")");
        this.u = user;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnNewButton = new JButton("Browse Movies");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(300, 175, 200, 55);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("Cancel Tickets");
        btnNewButton_1.addActionListener(this);
        btnNewButton_1.setBounds(300, 265, 200, 55);
        contentPane.add(btnNewButton_1);

        btnNewButton_2 = new JButton("Logout");
        btnNewButton_2.addActionListener(this);
        btnNewButton_2.setBounds(677, 50, 80, 23);
        contentPane.add(btnNewButton_2);

        JLabel lblNewLabel = new JLabel("Movie Theater Ticket Reservation App");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.black);
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 24));
        lblNewLabel.setBounds(183, 34, 421, 45);
        contentPane.add(lblNewLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnNewButton){
            MovieListView movies = new MovieListView(new MovieTicket(), u.getMemberid());
            movies.setVisible(true);
            dispose();
        }
        else if(e.getSource() == btnNewButton_1){
            RegCancelView cancel = new RegCancelView();
            cancel.setVisible(true);
            dispose();
        }
        else if(e.getSource() == btnNewButton_2){
            GuestUserView guest = new GuestUserView();
            guest.setVisible(true);
            dispose();
        }
    }
}
