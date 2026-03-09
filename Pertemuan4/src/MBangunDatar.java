/*  MBangunDatar.java
Deskripsi :berisi atribut dan method dalam class Main
Pembuat  :Johan Reinhart Calvin
Tanggal   :09/03/2026
*/
public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        Persegi1.printInfo();
        Lingkaran1.printInfo();

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi : " + Persegi1.getLuas());

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
    }
}