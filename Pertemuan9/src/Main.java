

public class Main {
    public static void main(String[] args) {

        Teman t = new Teman();
        t.addNama("Andi");t.addNama("Budi");t.addNama("Caca");t.addNama("Andi");
        System.out.println("Data awal:");
        t.showTeman();
        System.out.println("\nJumlah teman:");
        System.out.println(t.getNbelm());
        System.out.println("\nNama indeks 1:");
        System.out.println(t.getNama(1));
        t.setNama(1, "Dodi");
        System.out.println("\nSetelah setNama:");
        t.showTeman();
        System.out.println("\nCek member Andi:");
        System.out.println(t.isMember("Andi"));
        System.out.println("\nJumlah nama Andi:");
        System.out.println(t.countNama("Andi"));
        t.gantiNama("Caca", "Cici");
        System.out.println("\nSetelah gantiNama:");
        t.showTeman();
        t.delNama("Andi");
        System.out.println("\nSetelah delNama:");
        t.showTeman();

        Piaraan hehehe = new Piaraan();

        hehehe.enqueueAnabul(new Kucing("Mimi", 3.5));
        hehehe.enqueueAnabul(new Anjing("Doggo"));
        hehehe.enqueueAnabul(new Burung("Coco"));
        hehehe.enqueueAnabul(new Kucing("Kitty", 4.2));

        System.out.println("=== SHOW ANABUL ===");
        hehehe.showAnabul();

        System.out.println("\nJumlah Anabul:");
        System.out.println(hehehe.getNbelm());

        System.out.println("\nAnabul terdepan:");
        System.out.println(hehehe.getAnabul().getNama());

        System.out.println("\nJumlah Kucing:");
        System.out.println(hehehe.countKucing());

        System.out.println("\nTotal Bobot Kucing:");
        System.out.println(hehehe.bobotKucing());

        System.out.println("\n=== SHOW JENIS ANABUL ===");
        hehehe.showJenisAnabul();

        System.out.println("\nDequeue:");
        Anabul keluar = hehehe.dequeueAnabul();

        if (keluar != null) {
            System.out.println(keluar.getNama() + " keluar antrean");
        }

        System.out.println("\n=== SETELAH DEQUEUE ===");
        hehehe.showAnabul();

        System.out.println("\nCek member:");

        Anjing test = new Anjing("Doggo");

        System.out.println(hehehe.isMember(test));
    }
}


/* Koleksi bekerja dengan memanfaatkan struktur data 
agar operasi data lebih mudah dan efisien
 */