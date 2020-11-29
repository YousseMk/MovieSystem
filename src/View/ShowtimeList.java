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

public class ShowtimeList implements ActionListener {

        JFrame frame;
        JPanel panel;
        JButton[] showTimes;

        MovieTicket t;

    public void showShowtimes(MovieTicket t){

        this.t = t;

        frame = new JFrame("Showtimes");
        panel = new JPanel(new GridLayout(3,1));
        showTimes = new JButton[3];

        DBController dbc = new DBController();
        String stmt = "SELECT * FROM Movie where name = ?;";
        ResultSet rs;

        try{
            dbc.connectToDB();
            PreparedStatement ps = dbc.getCon().prepareStatement(stmt);
            ps.setString(1, this.t.getMovieName());
            rs = ps.executeQuery();

            int i = 0;
            while(rs.next()){
                showTimes[i] = new JButton(rs.getString(3) + " - " + rs.getString(4));
                showTimes[i].addActionListener(this);
                panel.add(showTimes[i]);
                i++;
            }

        }catch(SQLException e){
            e.getErrorCode();
        }

        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }

    public MovieTicket getT() {
        return t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            String overall = ((JButton) e.getSource()).getText();
            String[] startEnd = overall.split(" - ");
            this.t.setStartTime(startEnd[0]);
            this.t.setEndTime(startEnd[1]);
        }

    }
}
