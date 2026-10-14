public class Main {
    public static void main(String [] args) {
        Hewan h;

        h = new Kucing();
        h.suara();

        h = new Anjing();
        h.suara();

        h = new Burung();
        h.suara();
    }
}