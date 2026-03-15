/*  Main.java
Deskripsi :berisi atribut dan method dalam class Main
Pembuat  :Johan Reinhart Calvin
Tanggal   :15/03/2026
*/
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DosenTetap dosenTetap = new DosenTetap("9545647548","Andi",LocalDate.of(1990, 5, 5),LocalDate.of(2015, 1, 1),5_000_000,"Fakultas Sains dan Matematika","74848940");
        System.out.println("========== DOSEN TETAP ==========");
        dosenTetap.printInfo();
        System.out.println();
        DosenTamu dosenTamu = new DosenTamu(
                "8812345678",
                "Budi",
                LocalDate.of(1985, 3, 20),
                LocalDate.of(2023, 6, 1),
                4_500_000,
                "Fakultas Teknik",
                "99887766",
                LocalDate.of(2026, 6, 1)
        );
        System.out.println("========== DOSEN TAMU ==========");
        dosenTamu.printInfo();
        System.out.println();
        Tendik tendik = new Tendik(
                "7712349876",
                "Citra",
                LocalDate.of(1992, 8, 15),
                LocalDate.of(2018, 3, 1),
                3_500_000,
                "AKADEMIK"
        );
        System.out.println("========== TENDIK ==========");
        tendik.printInfo();
    }
}