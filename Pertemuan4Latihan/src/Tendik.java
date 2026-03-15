/*  Tendik.java
Deskripsi :berisi atribut dan method dalam class Tendik
Pembuat  :Johan Reinhart Calvin
Tanggal   :15/03/2026
*/
import java.time.LocalDate;


public  class Tendik extends Pegawai{
    //ATRIBUT
    private String bidang;
    private static final int BUP = 55;
//Method
    //Membuat Tendik tanpa parameter
    public Tendik(){
        super();
        bidang = "placeholder";
    }
    //Membuat Pegawai dengan Input
    public Tendik(String NIP,String nama,LocalDate tglLahir,LocalDate tmt, double gaji,String bidang){
        super(NIP,nama,tglLahir,tmt,gaji);
        this.bidang = bidang;
    }
    //Mengembalikan tanggal BUP dari tendik
    public LocalDate getTanggalBUP() {
        LocalDate bupBase = tglLahir.plusYears(BUP);
        return LocalDate.of(bupBase.getYear(), bupBase.getMonth(), 1).plusMonths(1);
    }
    //Mengembalikan tunjangan dari Tendik
    @Override
    public double getTunjangan() {
        return 0.01 * getMasaKerjaTahun() * gaji;
    }
    //Mengembalikan info dari tendik
    @Override
    public void printInfo() {
        int masaTahun = getMasaKerjaTahun();
        double tunjangan = getTunjangan();

        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tglLahir));
        System.out.println("TMT          : " + formatTanggal(tmt));
        System.out.println("Jabatan      : Tenaga Kependidikan");
        System.out.println("Bidang       : " + bidang);
        System.out.println("Masa Kerja   : " + getMasaKerja());
        System.out.println("BUP          : " + formatTanggal(getTanggalBUP()));
        System.out.println("Gaji Pokok   : " + formatRupiah(gaji));
        System.out.printf("Tunjangan    : 1%% x %d x %s = %s%n",
                masaTahun, formatRupiah(gaji), formatRupiah(tunjangan));
    }
}

