import java.util.Scanner;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatematikaCanggihBanget mtk = new MatematikaCanggihBanget();

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int c = input.nextInt();

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Penjumlahan:     " + mtk.tambah(a, b));
        System.out.println("Perkalian:       " + mtk.kali(a, b));
        System.out.println("Modulus:         " + mtk.modulus(a, b));
        System.out.println("PertambahanTiga: " + mtk.pertambahanTiga(a, b, c));

        input.close();
    }
}