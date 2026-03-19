/*  Manusia.java
Deskripsi :berisi atribut dan method dalam class Manusia
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/
import java.time.LocalDate;


abstract class Manusia {
    //ATRIBUT
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns;
//Method
    //Membuat manusia tanpa parameter
    public Manusia(){
        nama = "placeholder";
        tgl_mulai_kerja = LocalDate.of(1945,8,17);
        alamat = "placeholder";
        pendapatan = 0;
        counterMns++;
    }
    //Membuat manusia dengan input
    public Manusia(String nama,LocalDate mulaikerja,String alamat,double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = mulaikerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    //Mengembalikan nama dari manusia
    public String getNama(){
        return this.nama;
    }
    //Mengembalikan tanggal mulai kerja dari Manusia
    public LocalDate getTgl(){
        return this.tgl_mulai_kerja;
    }
    //Mengembalikan alamat dari Manusia
    public String getAlamat(){
        return this.alamat;
    }
    //Mengembalikan pendapatan dari manusia
    public double getPendapatan(){
        return this.pendapatan;
    }
    //Mengganti nama dari manusia
    public void setNama(String nama){
        this.nama = nama;
    }
    //Mengganti tanggal mulai kerja dari manusia
    public void setTgl(LocalDate tglMulaiKerja){
        this.tgl_mulai_kerja = tglMulaiKerja;
    }
    //Mengganti Alamat dari manusia
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    //Mengganti pendapatan dari manusia
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }
    public String formatTanggal(LocalDate date) {
        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return date.getDayOfMonth() + " " + bulan[date.getMonthValue() - 1] + " " + date.getYear();
    }
    //Mengeluarkan info dari Manusia
    public void cetakInfo(){
        System.out.println("Nama                   : " + nama);
        System.out.println("tglmulaikerja          : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat                 : " + alamat);
        System.out.println("Pendapatan             : " + pendapatan);
    }
    //Mengeluarkan counter dari class Manusia
    public static int getCounterMns(){
        return(counterMns);
    }
    //Mengembalikan masakerja dari Manusia
    public abstract int hitungMasaKerja();
}