/*  MTitik.java
Deskripsi : main Class Titik
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/02/2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
    }
}