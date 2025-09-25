import java.util.Scanner;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatematikaCanggih mtk = new MatematikaCanggih();

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Penjumlahan: " + mtk.tambah(a, b));
        System.out.println("Pengurangan: " + mtk.kurang(a, b));
        System.out.println("Perkalian:   " + mtk.kali(a, b));
        System.out.println("Pembagian:   " + mtk.bagi(a, b));
        System.out.println("Modulus:     " + mtk.modulus(a, b));

        input.close();
    }
}