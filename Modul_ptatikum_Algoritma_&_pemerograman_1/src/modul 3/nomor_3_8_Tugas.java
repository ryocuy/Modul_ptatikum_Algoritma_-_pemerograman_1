import java.util.Scanner;
public class nomor_3_8_Tugas {
    public static void main(String[] args) {
        System.out.println("TUGAS 1)");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam kerja per minggu: ");
        int jamKerja = input.nextInt();
        int totalGaji;

        if (jamKerja > 60) {
            // Jika lebih dari 60 jam kerja
            totalGaji = (60 * 5000) + ((jamKerja - 60) * 7500);
        } else if (jamKerja < 50) {
            // Jika kurang dari 50 jam kerja
            totalGaji = (jamKerja * 5000) - (2500 * (50 - jamKerja));
        } else {
            // Jika jam kerja dalam rentang 50-60
            totalGaji = jamKerja * 5000;
        }

        System.out.println("Total gaji: Rp" + totalGaji);

        // -----------------------------------------------------------------------------------------------------------

        System.out.println("--------------------------------------------------------------------------------------");
        
        System.out.println("TUGAS 2)");
        

        System.out.print("Masukkan total belanja buku (Rp): ");
        double totalBelanja = input.nextDouble();

        System.out.print("Masukkan nomor transaksi (ke-berapa): ");
        int noTransaksi = input.nextInt();

        double potongan = 0;

        if (totalBelanja > 50000) {
            // Diskon 10% untuk total belanja > Rp50.000
            potongan = totalBelanja * 0.10;

            if (noTransaksi <= 50) {
                // Diskon tambahan 5% untuk 50 transaksi pertama
                potongan += (totalBelanja - potongan) * 0.05;
            }
        }

        double totalBayar = totalBelanja - potongan;

        System.out.println("Total potongan: Rp" + potongan);
        System.out.println("Jumlah yang harus dibayar: Rp" + totalBayar);
        

        // ---------------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------------------------------------");


        System.out.println("TUGAS 3)");


        System.out.print("Masukkan nilai Tes Akademik: ");
        int tesAkademik = input.nextInt();

        System.out.print("Masukkan nilai Tes Keterampilan: ");
        int tesKeterampilan = input.nextInt();

        System.out.print("Masukkan nilai Tes Psikologi: ");
        int tesPsikologi = input.nextInt();

        // Menghitung rata-rata nilai
        double rataRata = (tesAkademik + tesKeterampilan + tesPsikologi) / 3.0;

        if (rataRata >= 75) {
            System.out.print("Diterima dan ");
            if (tesAkademik > tesKeterampilan && tesAkademik > tesPsikologi) {
                System.out.println("ditempatkan di bagian Administrasi.");
            } else if (tesPsikologi > tesAkademik && tesPsikologi > tesKeterampilan) {
                System.out.println("ditempatkan di bagian Produksi.");
            } else {
                System.out.println("ditempatkan di bagian Pemasaran.");
            }
        } else {
            System.out.println("Tidak diterima.");
        }

        input.close();
    }
}
    

    


