/*  MMahasiswa.java
Deskripsi :berisi main dari class mahasiwa
Pembuat  :Johan Reinhart Calvin
Tanggal   :02/03/2026
*/

public class MMahasiswa{
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO","Pemrograman berbasis objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data",3);
        Mahasiswa M1 = new Mahasiswa("234","Citra","Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB","motor");
        Dosen D1 = new Dosen("123","Andi","informatika");
        M1.setdosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah mata kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }

}