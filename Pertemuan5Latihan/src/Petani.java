/*  Petani.java
Deskripsi :berisi atribut dan method dalam class Petani
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/
import java.time.LocalDate;
import java.time.Period;


public class Petani extends Manusia implements Pajak {
    //ATRIBUT
    private String asal_kota;
    private static int counterPetani;
//Method
    //Membuat Petani tanpa parameter
    public Petani(){
        super();
        asal_kota = "placeholder";
        counterPetani++;
    }
    //Membuat Petani dengan input
    public Petani(String nama,LocalDate mulaikerja,String alamat,double pendapatan,String asal_kota){
        super(nama, mulaikerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    //Mengembalikan nama dari Petani
    public String getasal_kota(){
        return this.asal_kota;
    }
        //Mengganti asal kota dari petani
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }
    public int hitungMasaKerja(){
        int tahunKerja = Period.between(this.getTgl(),LocalDate.now()).getYears();
        return tahunKerja + 7;
    }
    //Mengeluarkan info dari Petani
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota              : " + asal_kota);
        
    }
    //Mengeluarkan counter dari class Petani
    public static int getCounterPetani(){
        return counterPetani;
    }
    //Mengembalikan hitungan pajak dari Petani
    @Override
    public double hitungPajak(){
        return 0;
    }
}