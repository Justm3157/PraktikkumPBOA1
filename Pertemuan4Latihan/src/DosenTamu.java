/*  DosenTamu.java
Deskripsi :berisi atribut dan method dalam class DosenTamu
Pembuat  :Johan Reinhart Calvin
Tanggal   :15/03/2026
*/
import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    //ATRIBUT
    private LocalDate tanggalKontrak;
    private String NIDK;
    //METHOD
    //Mengembalikan DosenTamu tanpa parameter
    public DosenTamu() {
        super();
        NIDK = "placeholder";
        tanggalKontrak = LocalDate.of(1945,8,17);
    }
    //Mengembalikan DosenTamu dengan input
    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String fakultas,String NIDK,LocalDate tanggalKontrak) {
        super(NIP, nama, tglLahir, tmt,gaji,fakultas);
        this.NIDK = NIDK;
        this.tanggalKontrak = tanggalKontrak;
    }
    //Mengembalikan sisakontrak dari dosenTamu
    public String getSisaKontrak() {
        Period period = Period.between(LocalDate.now(), tanggalKontrak);
        int totalBulan = period.getYears() * 12 + period.getMonths();
        return totalBulan + " bulan";
    }
    //Mengembalikan tunjangan dari dosenTamu
    @Override
    public double getTunjangan() {
        return 0.025 * gaji;
    }
    //Mengembalikan info dari dosenTamu
    @Override
    public void printInfo() {
        double tunjangan = getTunjangan();

        System.out.println("NIP                   : " + NIP);
        System.out.println("NIDK                  : " + NIDK);
        System.out.println("Nama                  : " + nama);
        System.out.println("Tanggal Lahir         : " + formatTanggal(tglLahir));
        System.out.println("TMT                   : " + formatTanggal(tmt));
        System.out.println("Jabatan               : Dosen Tamu");
        System.out.println("Fakultas              : " + fakultas);
        System.out.println("Masa Kerja            : " + getMasaKerja());
        System.out.println("Kontrak Berakhir      : " + formatTanggal(tanggalKontrak));
        System.out.println("Sisa Kontrak          : " + getSisaKontrak());
        System.out.println("Gaji Pokok            : " + formatRupiah(gaji));
        System.out.printf("Tunjangan             : 2,5%% x %s = %s%n",
                formatRupiah(gaji), formatRupiah(tunjangan));
    }
}