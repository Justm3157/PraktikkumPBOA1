/*  Garis.java
Deskripsi :berisi atribut dan method dalam class Garis
Pembuat  :Johan Reinhart Calvin
Tanggal   :01/03/2026
*/

public class Garis {
    //ATRIBUT
        private Titik awal;
        private Titik akhir;
        private static int counterGaris = 0;
    //METHOD
    //membuat Garis 0,0 -> 1,1
    public Garis(){
        this.awal = new Titik();
        this.akhir = new Titik(1,1);
        counterGaris++;
    }
    //Membuat garis dengan input (x,y),(a,b)
    public Garis(Titik T1, Titik T2){
        this.awal = T1;
        this.akhir = T2;
        counterGaris++;
    }
    //Mengembalikan panjang dari sebuah garis
    double getPanjang(){
        return this.awal.getJarak(akhir);
    }
    //Mengembalikan gradien dari sebuah garis
    float getGradien(){
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();

        if (dx == 0){
            return Float.POSITIVE_INFINITY; 
        }
        return (float)(dy / dx);
    }
    //Mengembalikan titik tengah dari sebuah garis
    Titik getTengah(){
        double x = (awal.getAbsis() + akhir.getAbsis())/2;
        double y = (awal.getOrdinat() + akhir.getOrdinat())/2;
        return new Titik(x,y);
    }
    //Mengecek apakah garis sejajar dengan garis lainnya
    boolean IsSejajar(Garis G){
        float m1 = this.getGradien();
        float m2 = G.getGradien();

        if (m1 == Float.POSITIVE_INFINITY && m2 == Float.POSITIVE_INFINITY){
            return true;
        }
        return Math.abs(m1 - m2) < 0.0001;
    }
    //Mengecek apakah garis tegak lurus dengan garis lainnya
    boolean IsTegakLurus(Garis G){
        float m1 = this.getGradien();
        float m2 = G.getGradien();
        if ((m1 == Float.POSITIVE_INFINITY && m2 == 0) ||
            (m2 == Float.POSITIVE_INFINITY && m1 == 0)){
            return true;
        }
        return Math.abs(m1 * m2 + 1) < 0.0001;
    }
    //Menampilkan titik awal dan titik akhir garis
    void printGaris(){
        System.out.print("Titik awal (");
        awal.printTitik();
        System.out.print("), Titik akhir (");
        akhir.printTitik();
        System.out.println(")");
    }
    //Menampilkan persamaan garis dalam bentuk persamaan Y = mx + c
    void printPersamaan(){
        System.out.println("garis yang dibuat dari");
        printGaris();
        double x1 = awal.getAbsis();
        double y1 = awal.getOrdinat();
        double x2 = akhir.getAbsis();
        if (x1 == x2){
        System.out.println("Mempunyai persamaan garis: x = " + x1);
        return;
    }
    float m = getGradien();
    double c = y1 - (m * x1);
    System.out.println("Mempunyai persamaan garis: y = " + m + "x + " + c);
}

    //Mengembalikan jumlah garis yang telah dibuat
    static void printCounterGaris(){
        System.out.println(counterGaris);
    }
}