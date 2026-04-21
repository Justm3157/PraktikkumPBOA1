/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
tgl :21/04/2026
*/

public class MMahasiswa {
    public static void main(String[] args){
        Mahasiswa JRC = new Mahasiswa();
        Mahasiswa CRJ = new Mahasiswa("240042","Calvin","Hukum");
        Mahasiswa CopyCalvin = new Mahasiswa(CRJ);
        JRC.SetProgramStudi();
        System.out.println(JRC.getProgramStudi());
        JRC.SetProgramStudi("Informatika");
        System.out.println(JRC.getProgramStudi());
        JRC.SetProgramStudi(CRJ);
        System.out.println(JRC.getProgramStudi());
        System.out.println(CopyCalvin.getProgramStudi());

    }
}
