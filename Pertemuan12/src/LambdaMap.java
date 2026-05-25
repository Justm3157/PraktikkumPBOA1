import java.util.HashMap;


public class LambdaMap {
    public static void main(String[] args){
    HashMap<String,String> mahasiswa = new HashMap<>();
    mahasiswa.put("001","Adi");
    mahasiswa.put("003","Bambang");
    mahasiswa.put("002","Cici");
    mahasiswa.put("004","Didi");

        mahasiswa.forEach((nim,nama) -> System.out.println(nim + " : " + nama));
    }
}
