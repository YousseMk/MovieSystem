package Model;

public class MovieTicket {
    private String seatID;
    private String movieName;
    private int tNum;
    private String theatreName;

    public MovieTicket(String s, String m, int num, String tn){
        seatID = s;
        movieName = m;
        tNum = num;
        theatreName = tn;
    }
}
