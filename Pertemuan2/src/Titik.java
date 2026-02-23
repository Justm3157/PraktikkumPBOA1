/*  Titik.java
Deskripsi :berisi atribut dan method dalam class Titik
Pembuat  :Johan Reinhart Calvin
Tanggal   :23/02/2026
*/

public class Titik {
    //ATRIBUT
        private double absis;
        private double ordinat;
        private static int counterTitik = 0;
    //METHOD
    //membuat titik 0,0
    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }
    //Mengembalikan counter titik
    static int getCounterTitik(){
        return counterTitik;
    }
    //Membuat titik dengan input x,y
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    //mengembalikan absis
    double getAbsis(){
        return absis;
    }
    //mengembalikan ordinat
    double getOrdinat(){
        return ordinat;
    }
    //Mengganti absis dengan x
    void setAbsis(double x){
        absis = x;
    }
    //Mengganti absis dengan y
    void setOrdinat(double y){
        ordinat = y;
    }
    //Menggeser titik sebanyak x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    //Mengoutput titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    //Mengoutput isi countertitik
    static void printCounterTitik(){
        System.out.println(counterTitik);
    }
    //Mengembalikan kuadran dari titik
    double kuadran(){
        double hasil;
        if(absis > 0){
            if(ordinat > 0){
                hasil = 1;
            }
            else{
                hasil = 4;
            }
        }
        else{
            if(ordinat > 0){
                hasil = 2;
            }
            else{
                hasil = 3;
            }
        }
        return hasil;
    }
    //Mengembalikan jarak titik ke pusat
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }
    //Mengembalikan jarak T1 ke T2
    double getJarak(Titik T){
        return Math.sqrt(Math.pow((absis - T.absis),2) + Math.pow((ordinat - T.ordinat),2));
    }
    //Merefleksikan titik terhadap sumbu X
    void refleksiX(){
        ordinat = ordinat*(-1);
    }
    //Merefleksikan titk terhadap sumbu Y
    void refleksiY(){
        absis = absis*(-1);
    }
    //membuat titik baru yang direfleksikan terhadap sumbu X
    Titik getRefleksiX(){
        Titik baru = this;
        baru.ordinat = ordinat*(-1);
        return baru;
    }
//membuat titik baru yang direfleksikan terhadap sumbu Y
    Titik getRefleksiY(){
        Titik baru = this;
        baru.absis = absis*(-1);
        return baru;
    }

}
