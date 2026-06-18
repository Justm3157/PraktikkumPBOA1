/*
    File    :Asersi2.java
    Deskripsi: Program untuk demo asersi, yang akan menlak
    input jari jari lingkaran yang bernilai nol
*/
//class lingkaran
class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) throws Exception {
        double jarijari = 0;
        assert(jarijari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
