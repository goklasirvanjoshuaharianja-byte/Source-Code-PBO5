class Anjing extends Hewan {

   Anjing(String nama) {
    super(nama);
   }

   void suara() {
    System.out.println(nama + " menggonggong");
   }

   void bermain() {
    System.out.println(nama + " sedang bermain");
   }
}