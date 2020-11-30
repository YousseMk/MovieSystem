package View;

import Controllers.DBController;
import Model.MovieTicket;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowtimeList extends JFrame implements ActionListener {

        JPanel panel;
        ArrayList<String> showTimes;
        private JPanel contentPane;
        JComboBox<String> comboBox;

        MovieTicket t;
        int id;

    public ShowtimeList(MovieTicket t, int memberid){

        this.t = t;
        this.id = memberid;
        t.setTheatreName("Cineplex");

        showTimes = new ArrayList<String>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Select Movie");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(98, 68, 96, 14);
        contentPane.add(lblNewLabel);

        DBController dbc = new DBController();
        String stmt = "SELECT * FROM Movie where name = ?;";
        ResultSet rs;

        try{
            dbc.connectToDB();
            PreparedStatement ps = dbc.getCon().prepareStatement(stmt);
            ps.setString(1, this.t.getMovieName());
            rs = ps.executeQuery();

            while(rs.next()){
                showTimes.add(rs.getString(3) + " - " + rs.getString(4));
                t.settNum(rs.getInt(2));
            }

        }catch(SQLException e){
            e.getErrorCode();
        }

        String [] messageStrings = showTimes.toArray(new String[showTimes.size()]);//database!!!!!!!!!!!!!!!!!!!
        comboBox = new JComboBox<>(messageStrings);
        comboBox.setBounds(238, 65, 200, 22);
        contentPane.add(comboBox);

        JButton btnNewButton = new JButton("Continue");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(220, 135, 115, 23);
        contentPane.add(btnNewButton);


    }

    public MovieTicket getT() {
        return t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            try {
                String msg = (String) comboBox.getSelectedItem();
                String[] startEnd = msg.split(" - ");
                this.t.setStartTime(startEnd[0]);
                this.t.setEndTime(startEnd[1]);

                JOptionPane.showMessageDialog(null, msg + " is selected.");
                if (true) {
                    SeatView seat = new SeatView(this.t, this.id);
                    seat.setVisible(true);
                    dispose();
                }

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1);
            }
        }

    }
}
