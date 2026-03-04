/*  Kendaraan.java
Deskripsi :berisi atribut dan method dalam class Kendaraan
Pembuat  :Johan Reinhart Calvin
Tanggal   :02/03/2026
*/


public class Kendaraan {
    /*ATRIBUT */
    private String noPlat;
    private String jenis;

    //METHOD
    //Membuat kendaraan tanpa parameter
    public Kendaraan(){
        noPlat = "placeholder";
        jenis = "placeholder";
    }
    //Membuat kendaraan dengan input
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    //Mengembalikan noPlat dari Kendaraan
    public String getnoPlat(){
        return noPlat;
    }
    //Mengembalikan jenis dari Kendaraan
    public String getJenis(){
        return jenis;
    }
    //Mengganti noPlat dari Kendaraan
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    //Mengganti jenis dari Kendaraan
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

}

