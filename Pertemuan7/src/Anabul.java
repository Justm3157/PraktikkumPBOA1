/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
tgl :21/04/2026
*/

abstract class Anabul {
    //kamus
    private String Nama;
    //algoritma
    public Anabul(){
        Nama = "manusia";
    }
    public Anabul(String nama){
        this.Nama = nama;
    }
    public String getNama(){
        return Nama;
    }
    public void setNama(String nama){
        this.Nama = nama;
    }
    public abstract String Gerak();
    public abstract String Bersuara();
}
