import homework.Concert;
import homework.Dancer;
import homework.Singer;

public class Main {
    public static void main(String[] args) {
        Concert concert = new Concert();
        Singer singer = new Singer();
        Dancer dancer = new Dancer();


        concert.music();
        singer.music();
        dancer.music();



    }
}

