import studi_kasus.*;

public class Main {
    public static void main(String [] args) {
        
       Kucing k = new Kucing("Cecep");
       Anjing a = new Anjing("Pablo");
       Burung b = new Burung("Ucup");

       Hewan h;

       h = k;
       h.suara();

       h = a;
       h.suara();

       h = b;
       h.suara();


       k.berburu();
       a.bermain();
       b.terbang();

    }
}