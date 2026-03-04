/*  Mahasiswa.java
Deskripsi :berisi atribut dan method dalam class Mahsiswa
Pembuat  :Johan Reinhart Calvin
Tanggal   :02/03/2026
*/

public class Mahasiswa {
    /*ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //METHOD
    //Membuat Mahasiswa tanpa parameter
    public Mahasiswa(){
        nim = "placeholder";
        nama = "placeholder";
        prodi = "placeholder";
        for(int i = 0;i<50;i++){
            listMatkul[i] = new MataKuliah();
        }
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }
    //Membuat Mahasiswa dengan input
    public Mahasiswa(String nim,String nama,String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        for(int i = 0;i<50;i++){
            listMatkul[i] = new MataKuliah();
        }
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }
    //Mengembalikan nim dari Mahasiswa
    public String getNim(){
        return nim;
    }
    //Mengembalikan Nama dari Mahasiswa
    public String getNama(){
        return nama;
    }
    //Mengembalikan prodi dari Mahasiswa
    public String getProdi(){
        return prodi;
    }
    //Mengembalikan matakuliah yang diambil mahasiswa
    public void getnamaMatKul(){
        for(int i = 0;i<50;i++){
            if(!listMatkul[i].getNama().equals("placeholder")){
                listMatkul[i].getNama();
                listMatkul[i].getSks();
                listMatkul[i].getidMatKul();
            } 
        }
    }
    //Mengembalikan waliDosen dari mahasiswa
    public void getdosenWali(){
        dosenWali.getNama();
        dosenWali.getNip();
        dosenWali.getProdi();
    }
    //mengembalikan kendaraan dari mahasiswa
    public void getKendaaraan(){
        kendaraan.getJenis();
        kendaraan.getnoPlat();
    }
    //Mengganti nama dari Mahasiswa
    public void setNama(String nama){
        this.nama = nama;
    }
    //Mengganti nim dari Mahasiswa
    public void setNim(String nim){
        this.nim = nim;
    }
    //Mengganti prodi dari Mahasiswa
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    //Mengganti Matkul ke X dari Mahasiswa
    public void setMatKul(MataKuliah ganti,int idx){
        listMatkul[idx].setNama(ganti.getNama());
        listMatkul[idx].setSks(ganti.getSks());
        listMatkul[idx].setidMatKul(ganti.getidMatKul()); 
    }
    //Mengganti dosenWali dari Mahasiswa
    public void setdosenWali(Dosen ganti){
        dosenWali.setNama(ganti.getNama());
        dosenWali.setNip(ganti.getNip());
        dosenWali.setProdi(ganti.getProdi());
    }
    //Mengganti kendaraan dari Mahasiswa
    public void setKendaraan(Kendaraan ganti){
        kendaraan.setJenis(ganti.getJenis());
        kendaraan.setnoPlat(ganti.getnoPlat());
    }
    //Menambahkan matkul ke atribut listmatkul
    public void addMatKul(MataKuliah matkul){
        int i = 0;
        while((listMatkul[i].getNama().equals("placeholder")) && i < 49){
            i++;
        }
        listMatkul[i].setNama(matkul.getNama());
        listMatkul[i].setSks(matkul.getSks());
        listMatkul[i].setidMatKul(matkul.getidMatKul());
    }
    //Mengembalikan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jumlahSKS = 0;
        for(int i = 0;i<50;i++){
            if(listMatkul[i].getSks() != 0){
                jumlahSKS += listMatkul[i].getSks();
            } 
        }
        return jumlahSKS;
    }
    //MEngembalikan jumlah Matkul yang diambil mahasiswa
    public int getJumlahMatkul(){
        int jumlahMatkul = 0;
        for(int i = 0;i<50;i++){
            if(!listMatkul[i].getNama().equals("placeholder")){
                jumlahMatkul ++;
            } 
        }
        return jumlahMatkul;
    }
    //Mengembalikan nim,nama dan prodi mahasiwa
    public void printMhs(){
        getNama();
        getNim();
        getProdi();
    }
    //Mengembalikan data detail dari mahasiswa
    public void printDetailMhs(){
        this.printMhs();
        for(int i = 0;i<50;i++){
            if(!listMatkul[i].getNama().equals("placeholder")){
                listMatkul[i].getNama();
            } 
        }
        this.getdosenWali();
        this.getKendaaraan();
    }
}

