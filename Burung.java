class Burung extends Hewan {

   Burung(String nama) {
    super(nama);
   }

   void suara() {
    System.out.println(nama + " berkicau");
   }

   void terbang() {
    System.out.println(nama + " sedang terbang");
   }
}