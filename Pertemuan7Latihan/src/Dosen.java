/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
Tgl :21/04/2026

*/

public class Dosen extends Civitasakademika{
    //kamus
    private String NIP;
    //method
    public Dosen(String nama,String NIP){
        super(nama);
        this.NIP = NIP;
    }

    public String getNomor(){
        return NIP;
    }
}
