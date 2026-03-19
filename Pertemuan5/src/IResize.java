/*  Iresize.java
Deskripsi :berisi atribut dan method dalam class Iresize
Pembuat  :Johan Reinhart Calvin
Tanggal   :19/03/2026
*/

public interface IResize {
    //METHOD
    //Menambah ukuran menjadi 10% lebih besar
    public void  zoomIn();
    //Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();
    //Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
