/*  DosenTetap.java
Deskripsi :berisi atribut dan method dalam class DosenTetap
Pembuat  :Johan Reinhart Calvin
Tanggal   :15/03/2026
*/
import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    //ATRIBUT
    private static final int BUP = 65;
    private String NIDN;
    //METHOD
    //Mengembalikan DosenTetap tanpa parameter
    public DosenTetap() {
        super();
        NIDN = "placeholder";
    }
    //Mengembalikan DosenTetap dengan input
    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String fakultas,String NIDN) {
        super(NIP, nama, tglLahir, tmt,gaji,fakultas);
        this.NIDN = NIDN;
    }
    //Mengembalikan BUP dari dosen Tetap
    public LocalDate getTanggalBUP() {
        LocalDate bupBase = tglLahir.plusYears(BUP);
        return LocalDate.of(bupBase.getYear(), bupBase.getMonth(), 1).plusMonths(1);
    }
    //Mengembalikan Tunjangan dari dosenTetap
    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * gaji;
    }
    //Mengembalikan info dari DosenTetap
    @Override
    public void printInfo() {
        int masaTahun = getMasaKerjaTahun();
        double tunjangan = getTunjangan();

        System.out.println("NIP          : " + NIP);
        System.out.println("NIDN         : " + NIDN);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tglLahir));
        System.out.println("TMT          : " + formatTanggal(tmt));
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Masa Kerja   : " + getMasaKerja());
        System.out.println("BUP          : " + formatTanggal(getTanggalBUP()));
        System.out.println("Gaji Pokok   : " + formatRupiah(gaji));
        System.out.printf("Tunjangan    : 2%% x %d x %s = %s%n",
                masaTahun, formatRupiah(gaji), formatRupiah(tunjangan));
    }
}
