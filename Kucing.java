class Kucing extends Hewan {
    
    Kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " mengeong");
    }

    void berburu() {
        System.out.println(nama + " sedang berburu");
    }
}