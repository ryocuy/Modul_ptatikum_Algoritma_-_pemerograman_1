import java.io.BufferedReader;
import java.io.InputStreamReader;
public class kegiatan_pratikum_3_3 {
    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int a;
        try {
            System.out.print("Masukan sebuah bilangan : ");
            
            a = Integer.parseInt(inp.readLine());
            switch (a) {
                case 0 : System.out.println("No 1");
                break;
                case 1 :System.out.println("satu");
                case 2 :System.out.println("dua");
                case 3 :System.out.println("tiga");
                case 4 :System.out.println("empat");
                case 5 :System.out.println("lima");
                case 6 :System.out.println("enam");
                case 7 :System.out.println("tujuh");
                case 8 :System.out.println("delapan");
                case 9 :System.out.println("sembilan");
                    break;
                    default:
                    System.out.println("bukan karakter digit");
            }
            
        } catch (Exception e) {
            System.out.println("bukan angka");
        }
    }

}
