class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void tampilData() {
        System.out.print("Nama : " + nama + " | ");
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.print("Jenis : Kucing | ");
        System.out.println("Suara : Mengeong");
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.print("Jenis : Anjing | ");
        System.out.println("Suara : Menggonggong");
    }
}

class Burung extends Hewan {
    Burung(String nama) {
        super(nama);
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.print("Jenis : Burung | ");
        System.out.println("Suara : Berkicau");
    }
}

public class studiKasus{
    public static void main(String [] args) {
        Hewan[] daftarHewan = {
            new Kucing("Asep"),
            new Anjing("Mumut"),
            new Burung("Noni"),
            new Kucing("Gori"),
            new Burung("Loli")
        };

        for (Hewan h : daftarHewan) {
            h.tampilData();
        }
    }
}