/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
Tgl :21/04/2026

*/

public class Main{
    public static void main (String[] args){
        Dosen Bowo = new Dosen("Bowopra", "001");
        Dosen jkw = new Dosen("joko", "002");
        Mahasiswa A = new Mahasiswa("Adhy", "201", Bowo);
        Mahasiswa B = new Mahasiswa("Axel", "202", Bowo);
        Mahasiswa C = new Mahasiswa("Anas", "203", Bowo);
        Mahasiswa D = new Mahasiswa("Kendal", "204", jkw);
        Mahasiswa E = new Mahasiswa("Vano", "205", jkw);

        Seminar GAA = new Seminar();
        GAA.registrasi(Bowo);
        GAA.registrasi(A);
        GAA.registrasi(B);
        GAA.registrasi(jkw);
        GAA.registrasi(E);
        GAA.registrasi(C);
        GAA.registrasi(D);
        GAA.tampilPeserta();
        GAA.countMahasiswa();
        A.setWali(jkw);
        A.tampilDataMahasiswa();
    }
}
