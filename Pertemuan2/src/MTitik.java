/*  MTitik.java
Deskripsi : main Class Titik
Pembuat  :Johan Reinhart Calvin
Tanggal   :23/02/2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        Titik T3 = new Titik(-2,2);
        T3.printTitik();
        Titik.printCounterTitik();
        double ujicoba = T3.kuadran();
        System.out.println("kuadran T3 " + ujicoba);
        double jarak1 = T3.getJarakPusat();
        System.out.println("jarak T3 ke pusat " + jarak1);
        double jarak2 = T2.getJarak(T3);
        System.out.println("jarak T2 ke T3 " + jarak2);
        Titik T4 = new Titik(2,4);
        T4.refleksiX();
        T4.printTitik();
    }
}