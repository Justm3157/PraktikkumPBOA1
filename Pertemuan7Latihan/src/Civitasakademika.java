/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
Tgl :21/04/2026

*/

abstract class Civitasakademika{
    //kamus
    private String Nama;
    //method
    public Civitasakademika(String nama){
        this.Nama = nama;
    }
    public void setNama(String nama){
        this.Nama = nama;
    }
    public String getNama(){
        return Nama;
    }
    abstract String getNomor();
}
