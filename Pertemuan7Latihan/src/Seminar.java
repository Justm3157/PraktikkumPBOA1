/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
Tgl :21/04/2026

*/

public class Seminar{
    //kamus
    private Civitasakademika[] pesertas ;
    private int banyakpeserta;
    //method
    public Seminar(){
        pesertas = new Civitasakademika[10];
        banyakpeserta = 0;
    }
    public int getBanyakpeserta(){
        return banyakpeserta;
    }
    public void registrasi(Civitasakademika orang){
        if(this.getBanyakpeserta() < 10)
        pesertas[banyakpeserta] = orang;
        banyakpeserta++;
    }
    public void tampilPeserta(){
        for(int i = 0;i < getBanyakpeserta();i++){
            System.out.println("No." + (i + 1) + " Nama: " + pesertas[i].getNama());
        }
    }
    public void countMahasiswa(){
        int count = 0;
        for(int i = 0;i < getBanyakpeserta();i++){
            if(pesertas[i] instanceof Mahasiswa){
                count++;
            }
        }
        System.out.println("Jumlah mahasiswa: " + count);
    }
}
