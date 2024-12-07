import java.util.Scanner;
public class Tugas_2_6 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Bilangan1: ");
    int Bilangan1 = input  .nextInt();
    System.out.println("Masukkan Bilangan2 : ");
    int Bilangan2 = input.nextInt();

    int penjumblahan = Bilangan1 + Bilangan2;
    System.out.println("Penjumlahan Bilangan1 dan Bilangan2 adalah : " + penjumblahan);

    int pengurangan = Bilangan1 - Bilangan2;
    System.out.println("Pengurangan Bilangan1 dan Bilangan2 adalah : " + pengurangan);

    int perkalian = Bilangan1 * Bilangan2;
    System.out.println("Perkalian Bilangan1 dan Bilangan2 adalah : " + perkalian);

    double pembagian = (double)Bilangan1 / Bilangan2;
    System.out.println("Pembagian Bilangan1 dan Bilangan2 adalah : " + pembagian);
    
    


// tugas program sederhana untuk menghitung luas segitiga 

        Scanner scanner = new Scanner(System.in);

        try {
            // Input alas dan tinggi
            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            // Menghitung luas segitiga
            double luas = 0.5 * alas * tinggi;

            // Output hasil
            System.out.printf("Luas segitiga = %.2f%n", luas);

        } catch (Exception e) {
            System.out.println("Input tidak valid! Harap masukkan angka.");
        }
    }
}

