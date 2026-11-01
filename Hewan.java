package studi_kasus;

public class Hewan {
    public String nama;
    public String jenis;

    Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    void suara() {
        System.out.println("Hewan sedang bersuara");
    }
}