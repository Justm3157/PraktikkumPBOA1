import java.util.ArrayList;
import java.util.List;


public class Teman {
    //atribut
    private int nbelm;
    private ArrayList<String> Lnama;
    //Method
    Teman(){
        nbelm = 0;
        Lnama = new ArrayList<String>();
    }
    public int getNbelm(){
        return nbelm;
    }
    public String getNama(int indeks) {

        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }

        return null;
    }
    public void setNama(int indeks, String nama) {

        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }
    public void delNama(String nama) {
        boolean hasil = Lnama.remove(nama);
        if (hasil) {
            nbelm--;
        } else {
            System.out.println("Nama tidak ditemukan");
        }
    }
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {

        int idx = Lnama.indexOf(nama);

        if (idx != -1) {
            Lnama.set(idx, namabaru);
        } else {
            System.out.println("Nama tidak ditemukan");
        }
    }

    public int countNama(String nama){
        int count = 0;
        for(String X:Lnama){
            if(X.equals(nama)){
                count++;
            }
        }
        return count;
    }
    public void showTeman(){
        System.out.println("Isi Lnama:");
        for(String i:Lnama){
            System.out.println(i);
        }
    }


}
