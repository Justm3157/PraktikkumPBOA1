/*  Dosen.java
Deskripsi :berisi atribut dan method dalam class Dosen
Pembuat  :Johan Reinhart Calvin
Tanggal   :15/03/2026
*/
import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    //ATRIBUT
    protected String fakultas;
    //METHOD
    //Membuat Dosen tanpa parameter
    public Dosen(){
        super();
        fakultas = "placeholder";
    }
    //Membuat dosen dengan input
    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String fakultas) {
        super(nip, nama, tglLahir, tmt, gaji);
        this.fakultas = fakultas;
    }
}
