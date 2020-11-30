package View;

import Controllers.BookingController;
import Controllers.DBController;
import Controllers.LoginController;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class RegCancelView extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField receiptNumField;
    private JButton btnNewButton;
    private JComboBox<String> comboBox;
    private ArrayList<String> bookings;

    int id;



    /**
     * Create the frame.
     */
    public RegCancelView(int memberid) {

        this.id = memberid;

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

        btnNewButton = new JButton("Cancel");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(222, 139, 115, 23);
        contentPane.add(btnNewButton);

        DBController dbc = new DBController();
        String stmt = "SELECT * FROM Booking WHERE memberid = ?;";
        bookings = new ArrayList<String>();
        PreparedStatement ps;
        ResultSet rs;

        try{
            dbc.connectToDB();
            ps = dbc.getCon().prepareStatement(stmt);
            ps.setInt(1, this.id);
            rs = ps.executeQuery();

            while(rs.next()){
                bookings.add(rs.getInt(1) + " " + rs.getString(3) + rs.getString(4) + "\n"
                + rs.getString(5) + " (" + rs.getString(7) + " - " + rs.getString(8) + ")");
            }

        }catch(SQLException e){
            e.getErrorCode();
        }



        String [] messageStrings = bookings.toArray(new String[bookings.size()]);
        comboBox = new JComboBox<>(messageStrings);
        comboBox.setBounds(269, 65, 103, 22);
        contentPane.add(comboBox);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnNewButton) {

            String msg = (String)comboBox.getSelectedItem();
            String temp[] = msg.split( " ");
            int bookingid = Integer.parseInt(temp[0]);
            BookingController b = new BookingController();
            b.regCancel(bookingid);
            JOptionPane.showMessageDialog(null, "Movie Cancelled Successfully");
            LoginController l = new LoginController();
            l.reConnect(id);
            dispose();

        }
    }

}