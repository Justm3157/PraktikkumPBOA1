/*  MGaris.java
Deskripsi : main Class Garis
Pembuat  :Johan Reinhart Calvin
Tanggal   :01/03/2026
*/

public class MGaris{
    public static void main(String[] args) {
        Garis g1 = new Garis(new Titik(0,0), new Titik(4,4));
        Garis g2 = new Garis(new Titik(2,0), new Titik(2,5));

        g1.printGaris();
        g2.printGaris();

        System.out.println(g1.getPanjang());
        System.out.println(g1.getGradien());

        g1.getTengah().printTitik();
        System.out.println();

        System.out.println(g1.IsSejajar(g2));
        System.out.println(g1.IsTegakLurus(g2));

        g1.printPersamaan();
        g2.printPersamaan();

        Garis.printCounterGaris();
    }
}
