/*  BangunDatar.java
Deskripsi :berisi atribut dan method dalam class BangunDatar
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/

abstract class BangunDatar {
    //ATRIBUT
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;
    //METHOD
    //Membuat BangunDatar tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }
    //Membuat BangunDatar dengan input
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
//Mengembalikan jumlah sisi dari BangunDatar
    public int getJmlSisi(){
        return jmlSisi;
    }
//Mengganti jmlsisi dari BangunDatar
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }
//Mengembalikan warna dari BangunDatar
    public String getWarna(){
        return warna;
    }
//Mengganti warna dari BangunDatar
    public void setWarna(String warna){
        this.warna = warna;
    }
//Mengembalikan border dari BangunDatar
    public String getBorder(){
        return border;
    }
//Mengganti border dari BangunDatar
    public void setBorder(String border){
        this.border = border;
    }
//Mengeluarkan info atribut dari BangunDatar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
//Mengeluarkan counterbangundatar dari bangundatar
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun datar: " + counterBangunDatar);
    }
//Mengembalikan luas dari BangunDatar
    public abstract double getLuas();
//Mengembalikan keliling dari bangundatar
    public abstract double getKeliling();

//Mengecek apakah bangundatar 1 dan 2 memiliki luas yang sama
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }
//Mengecek apakah bangun datar 1 dan 2 memiliki keliling yang sama
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}
