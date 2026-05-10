/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
tgl :21/04/2026
*/

abstract class Anabul {
    //kamus
    private String panggilan;
    //algoritma
    public Anabul(){
        panggilan = "manusia";
    }
    public Anabul(String nama){
        this.panggilan = nama;
    }
    public String getNama(){
        return panggilan;
    }
    public void setNama(String nama){
        this.panggilan = nama;
    }
    public abstract String Gerak();
    public abstract String Bersuara();
}
