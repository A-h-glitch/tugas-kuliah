import java.util.Scanner;

public class MatematikaBeraksi {
    private Matematika mtk;

    // Konstruktor untuk operasi matematika
    public MatematikaBeraksi(int pilihan, int a, int b) {
        mtk = new Matematika();

        switch (pilihan) {
            case 1:
                System.out.println("Pertambahan : " + a + " + " + b + " = " + mtk.pertambahan(a, b));
                break;
            case 2:
                System.out.println("Pengurangan : " + a + " - " + b + " = " + mtk.pengurangan(a, b));
                break;
            case 3:
                System.out.println("Perkalian   : " + a + " * " + b + " = " + mtk.perkalian(a, b));
                break;
            case 4:
                System.out.println("Pembagian   : " + a + " / " + b + " = " + mtk.pembagian(a, b));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, a, b;

        do {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Tampilkan Lagu Bingo");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama: ");
                a = input.nextInt();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextInt();

                // Panggil konstruktor untuk eksekusi operasi
                new MatematikaBeraksi(pilihan, a, b);
            } else if (pilihan == 5) {
                // Panggil konstruktor untuk lagu Bingo
                new BingoSong();
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");
        input.close();
    }
}