/*  Persegi.java
Deskripsi :berisi atribut dan method dalam class Persegi
Pembuat  :Johan Reinhart Calvin
Tanggal   :09/03/2026
*/

public class Persegi extends BangunDatar {
    //ATRIBUT
    private double sisi;
//Method
    //Membuat Persegi tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }
    //Membuat persegi dengan input
    public Persegi(double sisi,String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }
//Mengembalikan sisi dari persegi
    public double getSisi(){
        return sisi;
    }
//MEngganti sisi dari persegi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
//Mengembalikan luas dari persegi
    public double getLuas(){
        return sisi*sisi;
    }
//Mengembalikan keliling dari persegi
    public double getKeliling(){
        return sisi*4;
    }
//Mengembalikan diagonal dari persegi
    public double getDiagonal(){
        return sisi*Math.sqrt(2);
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
