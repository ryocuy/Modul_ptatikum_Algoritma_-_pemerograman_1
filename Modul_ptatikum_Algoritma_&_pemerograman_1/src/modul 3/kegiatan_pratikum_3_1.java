
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class kegiatan_pratikum_3_1 {
    public static void main(String[] args) {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        int bilangan; 

            try {
                System.out.println("Masukan bilangan yang ingin di cek : ");

                bilangan = Integer.parseInt(inp.readLine());


                if (bilangan % 2 == 0) {

                    System.out.println("Bilangan Genap");
                    
                } else {
                    System.out.println(" Bilangan Ganjil");
                }
                
            } catch (Exception e) {
                System.out.println("masukan harus berupa angka");
            
            }
            



    }

}
