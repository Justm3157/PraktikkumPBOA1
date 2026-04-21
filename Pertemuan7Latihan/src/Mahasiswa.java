/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
Tgl :21/04/2026

*/


public class Mahasiswa extends Civitasakademika{
    //kamus
    private String NIM;
    private Dosen dosenwali;
    //method
    public Mahasiswa(String nama,String NIM,Dosen Dosenwali){
        super(nama);
        this.NIM = NIM;
        dosenwali = Dosenwali;
    }

    public String getNomor(){
        return NIM;
    }
    public Dosen getDosenWali(){
        return dosenwali;
    }
    public void setWali(Dosen wali){
        dosenwali = wali;
    }
    public void tampilDataMahasiswa(){
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Dosen: " + dosenwali.getNama());
    }
}
