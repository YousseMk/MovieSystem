package View;

import Controllers.DBController;
import Model.MovieTicket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SeatView implements ActionListener {

    private JButton seatGrid[][];
    private ArrayList<String> booked;

    MovieTicket t;

    public void DisplayAvailSeats(MovieTicket ticket){

        this.t = ticket;
        booked = new ArrayList<String>();

        JFrame frame = new JFrame("SEATS");
        JPanel panel = new JPanel(new GridLayout(5,5));

        seatGrid = new JButton[5][5];

        DBController dbc = new DBController();
        String stmt = "select * FROM Booking where moviename  = ? AND showstart = ? AND showend = ?;";
        PreparedStatement ps;
        ResultSet rs;

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

        char row = 'a';
        for(int i = 0; i < 5; i ++){
            int col = 1;
            for(int j = 0; j < 5; j ++){
                seatGrid[i][j] = new JButton(row + Integer.toString(col));
                if(booked.contains(seatGrid[i][j].getText())){
                    seatGrid[i][j].setText("BOOKED");
                }
                seatGrid[i][j].addActionListener(this);
                panel.add(seatGrid[i][j]);
                col ++;
            }
            row ++;
        }

        frame.add(panel);
        frame.setSize(1000,1000);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            String buttonName = (((JButton) e.getSource()).getText());
            System.out.println(buttonName);
        }
    }
}
