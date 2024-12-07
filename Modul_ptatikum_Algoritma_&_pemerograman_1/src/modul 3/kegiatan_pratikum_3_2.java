import java.util.Scanner;


public class kegiatan_pratikum_3_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int suhu;
            System.out.print("masukan suhu :");
            suhu = input.nextInt();

            if (suhu > 0) {
                System.out.print("benda berbentuk padat");
            } else if (suhu > 0 && suhu < 100) {
                System.out.print(" benda berbentuk cair");
            } else {
                System.out.print(" benda berbentuk gas");
            }
        }
    }
}
