/*  Dosen.java
Deskripsi :berisi atribut dan method dalam class Dosen
Pembuat  :Johan Reinhart Calvin
Tanggal   :02/03/2026
*/


public class Dosen {
    /*ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    //METHOD
    //Membuat Dosen tanpa parameter
    public Dosen(){
        nip = "placeholder";
        nama = "placeholder";
        prodi = "placeholder";
    }
    //Membuat Dosen dengan input
    public Dosen(String nomor,String name, String prod){
        nip = nomor;
        nama = name;
        prodi = prod;
    }
    //Mengembalikan nip dari Dosen
    public String getNip(){
        return nip;
    }
    //Mengembalikan nama dari Dosen
    public String getNama(){
        return nama;
    }
    //Mengembalikan prodi dari Dosen
    public String getProdi(){
        return prodi;
    }
    //Mengganti nip dari Dosen
    public void setNip(String nip){
        this.nip = nip;
    }
    //Mengganti nama dari Dosen
    public void setNama(String nama){
        this.nama = nama;
    }
    //Mengganti prodi dari Dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}


