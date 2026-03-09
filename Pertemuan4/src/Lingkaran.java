/*  Lingkaran.java
Deskripsi :berisi atribut dan method dalam class Lingkaran
Pembuat  :Johan Reinhart Calvin
Tanggal   :09/03/2026
*/

public class Lingkaran extends BangunDatar {
    //ATRIBUT
    private double jari;
//Method
    //Membuat Lingkaran tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }
    //Membuat Lingkaran dengan input
    public Lingkaran(double diameter,String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }
//Mengembalikan jari dari Lingkaran
    public double getjari(){
        return jari;
    }
//MEngganti jari dari Lingkaran
    public void setjari(double jari){
        this.jari = jari;
    }
//Mengembalikan luas dari Lingkaran
    public double getLuas(){
        return Math.PI*jari*jari;
    }
//Mengembalikan keliling dari Lingkaran
    public double getKeliling(){
        return Math.PI*2*jari;
    }
}
