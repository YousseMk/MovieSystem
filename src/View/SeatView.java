package View;

import Controllers.BookingController;
import Controllers.DBController;
import Controllers.LoginController;
import Model.MovieTicket;
import Model.RegisteredUser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SeatView extends JFrame implements ActionListener {

    private JButton seatGrid[][];
    private ArrayList<String> booked;
    private JPanel contentPane;

    MovieTicket t;
    int id;

    public SeatView(MovieTicket ticket, int memberid){

        this.t = ticket;
        this.id = memberid;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(5, 5, 3, 3));

        booked = new ArrayList<String>();
        seatGrid = new JButton[5][5];

        DBController dbc = new DBController();
        String stmt = "select * FROM Booking where moviename  = ? AND showstart = ? AND showend = ?;";
        String stmt2 = "select * FROM BookingforGuest where moviename  = ? AND showstart = ? AND showend = ?;";
        PreparedStatement ps;
        PreparedStatement ps2;
        ResultSet rs;
        ResultSet rs2;

        try{
            dbc.connectToDB();
            ps = dbc.getCon().prepareStatement(stmt);

            ps.setString(1, this.t.getMovieName());
            ps.setString(2, this.t.getStartTime());
            ps.setString(3, this.t.getEndTime());
            rs = ps.executeQuery();

            while(rs.next()){
                String seat = rs.getString(3) + Integer.toString(rs.getInt(4));
                booked.add(seat);
            }

            dbc.disconnectFromDB();


        }catch(SQLException e){
            e.getErrorCode();
        }

        try{

            dbc.connectToDB();

            ps2 = dbc.getCon().prepareStatement(stmt2);
            ps2.setString(1, this.t.getMovieName());
            ps2.setString(2, this.t.getStartTime());
            ps2.setString(3, this.t.getEndTime());
            rs2 = ps2.executeQuery();

            while(rs2.next()){
                String seat2 = rs2.getString(3) + Integer.toString(rs2.getInt(4));
                booked.add(seat2);
            }


            dbc.disconnectFromDB();
        }catch(SQLException e){
            e.getErrorCode();
        }

        char row = 'a';
        for(int i = 0; i < 5; i ++){
            int col = 1;
            for(int j = 0; j < 5; j ++){
                seatGrid[i][j] = new JButton(row + Integer.toString(col));
                if(booked.contains(seatGrid[i][j].getText())){
                    seatGrid[i][j].setText("BOOKED");
                    seatGrid[i][j].setEnabled(false);

                }
                seatGrid[i][j].addActionListener(this);
                contentPane.add(seatGrid[i][j]);
                col ++;
            }
            row ++;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            String buttonName = (((JButton) e.getSource()).getText());
            t.setSeatID(buttonName);
            BookingController b = new BookingController();
            if(this.id == 0){
                JOptionPane.showMessageDialog(null, buttonName + " is selected. Movie booked.");
                PaymentView p = new PaymentView(t, id);
                p.setVisible(true);
                dispose();

            }else {
                b.addBooking(this.t, this.id);

                JOptionPane.showMessageDialog(null, buttonName + " is selected. Movie booked.");

                LoginController lc = new LoginController();
                RegisteredUser r = lc.reConnect(this.id);
                RegUserView reg = new RegUserView(r);
                reg.setVisible(true);
                dispose();
            }

        }
    }
}
