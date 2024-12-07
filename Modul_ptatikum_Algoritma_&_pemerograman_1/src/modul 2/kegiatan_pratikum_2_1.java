public class kegiatan_pratikum_2_1 {
    public static void main(String[] args) {
        String nilai1 = "100";
        String nilai2 = "2.5";
        
        int bulat = Integer.parseInt(nilai1);
        double pecahan = Double.parseDouble(nilai2);
        System.out.println("Hasil dari nilai 1: " + nilai1);
        System.out.println("Hasil dari nilai 2: " + nilai2);

        // System.out.println("Hasil perkalian nilai 1 dan nilai 2 : " + nilai1 * nilai2);      // Terjadi eroro di karenakan string nilai1 di kali dengan string nilai2

        
        System.out.println("Hasil penjumblahan nilai 1 dengan nilai 2 : " + (nilai1 + nilai2));
        System.out.println(" ");
        System.out.println("Hasil perkalian antara bulat dengan pecahan : " + (bulat * pecahan));
        
    }

}
