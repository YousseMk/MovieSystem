package View;

import Controllers.DBController;
import Model.Movie;
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

public class MovieListView extends JFrame implements ActionListener {

    JPanel panel;
    MovieTicket t;
    int id;
    private JPanel contentPane;
    JButton btnNewButton;
    JComboBox<String> comboBox;

    public MovieListView(MovieTicket t, int memberid){

        this.t = t;
        this.id = memberid;

        DBController dbc = new DBController();
        ResultSet rs;
        String stmt = "Select distinct name from Movie;";
        ArrayList<String> movies = new ArrayList<String>();

        try{
            dbc.connectToDB();
            PreparedStatement ps = dbc.getCon().prepareStatement(stmt);
            rs = ps.executeQuery();

            while(rs.next()){
                movies.add(rs.getString(1));
            }

            dbc.disconnectFromDB();

        }catch(SQLException e){
            e.getErrorCode();
        }

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

        String movieArray[] =  movies.toArray(new String[movies.size()]);
        comboBox = new JComboBox<>(movieArray);
        comboBox.setBounds(238, 65, 200, 22);
        contentPane.add(comboBox);

        btnNewButton = new JButton("Continue");
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
        if(e.getSource() == btnNewButton) {
            String msg = (String) comboBox.getSelectedItem();
            t.setMovieName(msg);

            JOptionPane.showMessageDialog(null, msg + " is a good choice.");
            if (true) {
                ShowtimeList showtime = new ShowtimeList(this.t, this.id);
                showtime.setVisible(true);
                dispose();
            }
        }
    }
}
