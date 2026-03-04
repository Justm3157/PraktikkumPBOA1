/*  MataKuliah.java
Deskripsi :berisi atribut dan method dalam class MataKuliah
Pembuat  :Johan Reinhart Calvin
Tanggal   :02/03/2026
*/


public class MataKuliah {
    /*ATRIBUT */
    private String idMatKul;
    private String nama;
    private int sks;

    //METHOD
    //Membuat Matkul tanpa parameter
    public MataKuliah(){
        idMatKul = "placeholder";
        nama = "placeholder";
        sks = 0;
    }
    //Membuat matKul dengan input
    public MataKuliah(String nomor,String nama,int sks){
        idMatKul = nomor;
        this.nama = nama;
        this.sks = sks;
    }
    //Mengembalikan idMatKul dari Matkul
    public String getidMatKul(){
        return idMatKul;
    }
    //Mengembalikan nama dari Matkul
    public String getNama(){
        return nama;
    }
    //Mengembalikan sks dari Matkul
    public int getSks(){
        return sks;
    }
    //Mengganti idmatkul dari matkul
    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }
    //Mengganti nama dari Matkul
    public void setNama(String nama){
        this.nama = nama;
    }
    //Mengganti sks dariMatkul
    public void setSks(int sks){
        this.sks = sks;
    }
}

