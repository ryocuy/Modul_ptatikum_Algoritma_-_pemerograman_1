
import java.util.Scanner;
public class tugas_halaman_29 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 1;
        char repeat;

        do {
            System.out.print("Masukkan bilangan ke-" + count + ": ");
            int number = scanner.nextInt();
            total += number;

            System.out.print("Mau memasukkan data lagi? [y/t]: ");
            repeat = scanner.next().charAt(0);
            count++;
        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Total bilangan = " + total);
        scanner.close();
    }
}
        
    