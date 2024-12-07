
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MasukanKeyboard_1_2_6{
    public static void main(String[] args){
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.print("Usia Anda: ");
                int umur = Integer.parseInt(inp.readLine());
                System.out.println("Usia Saya " + umur + " tahun"); 
            } catch (Exception e) {
                System.out.println("Error: Yang di masukan harus berupa angka" );
            }
    }
}
