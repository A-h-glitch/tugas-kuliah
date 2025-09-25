import java.util.Scanner;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        // Buat objek MatematikaCanggih
        MatematikaCanggih mtk = new MatematikaCanggih(nim, nama);

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM  : " + mtk.getNim());
        System.out.println("Nama : " + mtk.getNama());

        // Input angka
        System.out.print("\nMasukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        System.out.print("Masukkan angka ketiga: ");
        double c = input.nextDouble();

        // Uji coba method
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Pertambahan (a+b):        " + mtk.pertambahan(a, b));
        System.out.println("Pertambahan (a+b+c):      " + mtk.pertambahan(a, b, c));
        System.out.println("Pengurangan (a-b):        " + mtk.pengurangan(a, b));
        System.out.println("Pengurangan (a-b-c):      " + mtk.pengurangan(a, b, c));
        System.out.println("Perkalian (a*b):          " + mtk.perkalian(a, b));
        System.out.println("Pembagian (a/b):          " + mtk.pembagian(a, b));
        System.out.println("Modulus (a%b):            " + mtk.modulus(a, b));

        input.close();
    }
}