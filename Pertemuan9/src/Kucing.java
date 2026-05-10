/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
tgl :21/04/2026
*/

public class Kucing extends Anabul {
    //kamus
    private double berat;
    //algoritma
    public Kucing(){
        super();
        berat = 0;
    }
    public Kucing(String nama,double berat){
        super(nama);
        this.berat = berat;
    }
    public String Gerak(){
        return "melata";
    }
    public String Bersuara(){
        return "meong";
    }
    public double getBerat(){
        return this.berat;
    }
}
