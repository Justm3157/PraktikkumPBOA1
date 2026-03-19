/*  Lingkaran.java
Deskripsi :berisi atribut dan method dalam class Lingkaran
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/

public class Lingkaran extends BangunDatar implements IResize {
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
        //Menambah ukuran menjadi 10% lebih besar
    @Override
    public void  zoomIn(){
        jari = jari*1.1;
    }
    //Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari*0.9;
    }
    //Menskalakan ukuran sesuai dengan input percent yang diberikan
    @Override
    public void zoom(int percent){
        jari = jari*percent/100;
    }
}
