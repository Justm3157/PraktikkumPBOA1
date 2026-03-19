/*  PNS.java
Deskripsi :berisi atribut dan method dalam class PNS
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/
import java.time.LocalDate;
import java.time.Period;


public class PNS extends Manusia implements Pajak {
    //ATRIBUT
    private String nip;
    private static int counterPNS;
//Method
    //Membuat PNS tanpa parameter
    public PNS(){
        super();
        nip = "placeholder";
        counterPNS++;
    }
    //Membuat PNS dengan input
    public PNS(String nama,LocalDate mulaikerja,String alamat,double pendapatan,String nip){
        super(nama, mulaikerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    //Mengembalikan nama dari PNS
    public String getNIP(){
        return this.nip;
    }
    //Mengganti NIP dari PNS
    public void setNIP(String nip){
        this.nip = nip;
    }
    public int hitungMasaKerja(){
        int tahunKerja = Period.between(this.getTgl(),LocalDate.now()).getYears();
        return tahunKerja + 6;
    }
    //Mengeluarkan info dari PNS
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("nip                    : " + nip);
        
    }
    //Mengeluarkan counter dari class PNS
    public static int getCounterPNS(){
        return counterPNS;
    }
    //Mengembalikan hitungan pajak dari PNS
    @Override
    public double hitungPajak(){
        return 0.1*getPendapatan();
    }
}