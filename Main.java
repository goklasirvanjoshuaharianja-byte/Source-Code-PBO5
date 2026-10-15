public class Main {
    public static void main(String [] args) {
        
        Hewan [] daftarHewan = {
            new Kucing("Cecep"),
            new Kucing("Bobon"),
            new Anjing("Pablo"),
            new Anjing("Kipli"),
            new Burung("Ucup")
        };

        for (Hewan h : daftarHewan) {
            h.suara();
        }
    }
}