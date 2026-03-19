/*  Pengusaha.java
Deskripsi :berisi atribut dan method dalam class Pengusaha
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/
import java.time.LocalDate;
import java.time.Period;


public class Pengusaha extends Manusia implements Pajak {
    //ATRIBUT
    private String npwp;
    private static int counterPengusaha;
//Method
    //Membuat Pengusaha tanpa parameter
    public Pengusaha(){
        super();
        npwp = "placeholder";
        counterPengusaha++;
    }
    //Membuat Pengusaha dengan input
    public Pengusaha(String nama,LocalDate mulaikerja,String alamat,double pendapatan,String npwp){
        super(nama, mulaikerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    //Mengembalikan nama dari Pengusaha
    public String getNPWP(){
        return this.npwp;
    }
        //Mengganti NPWP dari Pengusaha
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }
    public int hitungMasaKerja(){
        int tahunKerja = Period.between(this.getTgl(),LocalDate.now()).getYears();
        return tahunKerja + 7;
    }
    //Mengeluarkan info dari Pengusaha
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP                   : " + npwp);
        
    }
    //Mengeluarkan counter dari class Pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
    //Mengembalikan hitungan pajak dari Pengusaha
    @Override
    public double hitungPajak(){
        return 0.15*getPendapatan();
    }
}