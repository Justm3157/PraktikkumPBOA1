/*  Pegawai.java
Deskripsi :berisi atribut dan method dalam class Pegawai
Pembuat  :Johan Reinhart Calvin
Tanggal   :15/03/2026
*/
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    //ATRIBUT
    protected String NIP;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gaji;
//Method
    //Membuat Pegawai tanpa parameter
    public Pegawai(){
        NIP = "placeholder";
        nama = "placeholder";
        tglLahir = LocalDate.of(1945,8,17);
        tmt = LocalDate.of(1945,8,17);
        gaji = 0;
    }
    //Membuat Pegawai dengan Input
    public Pegawai(String NIP,String nama,LocalDate tglLahir,LocalDate tmt, double gaji){
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gaji = gaji;
    }
    //Mengembalikan Masa kerja dalam tahun dan bulan
    public String getMasaKerja() {
        Period period = Period.between(tmt, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }
    //Mengembalikan masa kerja dalam tahun
    public int getMasaKerjaTahun() {
        return Period.between(tmt, LocalDate.now()).getYears();
    }
    //Mengembalikan tanggal agar dapat diubah type menjadi string
    public String formatTanggal(LocalDate date) {
        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return date.getDayOfMonth() + " " + bulan[date.getMonthValue() - 1] + " " + date.getYear();
    }
    //Mengembalikan rupiah agar dapat diubah menjadi string
    public String formatRupiah(double amount) {
        return String.format("Rp %,.2f", amount).replace(",", ".");
    }
    //Abstrak, mengembalikan tunjangan
    public abstract double getTunjangan();
    //Mengembalikan info dari pegawai
    public abstract void printInfo();
}

