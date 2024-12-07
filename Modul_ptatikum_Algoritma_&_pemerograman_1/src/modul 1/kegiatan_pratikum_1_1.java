
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class kegiatan_pratikum_1_1 {
    
    public static void main(String[] args) {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));


        String namadepan;
        String namabelakang;
        String alamat;
        String tempatlahir;
        String tanggallahir;
        int    usia;

        try {
            System.out.print("Masukkan Nama Depan : ");
            namadepan = inp.readLine();
            System.out.print("Masukkan Nama Belakang : ");
            namabelakang = inp.readLine();
            System.out.print("Masukkan Alamat : ");
            alamat = inp.readLine();
            System.out.print("Masukkan Tempat Lahir : ");
            tempatlahir = inp.readLine();
            System.out.print("Masukkan Tanggal Lahir : ");
            tanggallahir = inp.readLine();
            System.out.print("Masukkan Usia : ");
            usia = Integer.parseInt(inp.readLine());

            System.out.println("Nama Depan Saya Adallah " + namadepan);
            System.out.println("Nama Belakang Saya Adallah " + namabelakang);
            System.out.println("Alamat Saya Adallah " + alamat);
            System.out.println("Tempat Lahir Saya Adallah " + tempatlahir);
            System.out.println("Tanggal Lahir Saya Adallah " + tanggallahir);
            System.out.println("Usia Saya Adallah " + usia + " Tahun");
            
            
            
        } catch (Exception e) {
            System.out.println("Error " );
        }
    
        


    }


}
