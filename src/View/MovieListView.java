package View;

import Controllers.DBController;
import Model.Movie;
import Model.MovieTicket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieListView implements ActionListener {

    JFrame frame;
    JPanel panel;

    MovieTicket t;

    public void showMovies(MovieTicket t){

        this.t = t;

        DBController dbc = new DBController();
        ResultSet rs;
        String stmt = "Select distinct name from Movie;";
        ArrayList<JButton> movies = new ArrayList<JButton>();

        try{
            dbc.connectToDB();
            PreparedStatement ps = dbc.getCon().prepareStatement(stmt);
            rs = ps.executeQuery();

            while(rs.next()){
                movies.add(new JButton(rs.getString(1)));
            }

            dbc.disconnectFromDB();

        }catch(SQLException e){
            e.getErrorCode();
        }

        frame = new JFrame("Movies");
        panel = new JPanel(new GridLayout(10,5));

        for(int i = 0; i < movies.size(); i ++){
            movies.get(i).addActionListener(this);
            panel.add(movies.get(i));
        }

        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    public MovieTicket getT() {
        return t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            String moviename = ((JButton) e.getSource()).getText();
            this.t.setMovieName(moviename);
        }
    }
}
