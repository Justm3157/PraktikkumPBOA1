/*
NIM :24060124130076
Nama:Johan Reinhart Calvin
tgl :21/04/2026
*/

public class Coercion {
    public static void main(String[] args){
        //kamus
        int tes;
        int yay;
        //algoritma
        //A
        tes = 65;
        yay = 10;
        System.out.println("Integer " + tes);
        System.out.println("double " + (double)tes);
        System.out.println("Char " + (char)tes);
        String ganti = Integer.toString(tes);
        System.out.println(ganti);
        int gantii = Integer.parseInt(ganti);
        gantii = gantii + yay;
        System.out.println(gantii);
        String skuy = "10.0";
        double skuyy = Double.parseDouble(skuy);
        System.out.println(skuyy);

        //B
        int btes = 10;
        double byay = (double)btes;
        int byayy = (int)byay;
        System.out.println(byayy);

        //C
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("String: " + S + " Int:" + Z);

        //D
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("String: " + R + " Double:" + D);

        //E
        int A = Integer.parseInt(S);
        System.out.println(A);

        //F
        String T = Integer.toString(A);
        System.out.println(T);

    }
}
