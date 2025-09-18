import java.util.Scanner;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Matematika mtk = new Matematika();
        Matematika2 mtk2 = new Matematika2();

        int pilihan, a, b;

        do {
            System.out.println("\n=== Program Operasi Matematika (Inheritance) ===");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan angka pertama: ");
                a = input.nextInt();
                System.out.print("Masukkan angka kedua: ");
                b = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Hasil: " + a + " + " + b + " = " + mtk.pertambahan(a, b));
                        break;
                    case 2:
                        System.out.println("Hasil: " + a + " - " + b + " = " + mtk.pengurangan(a, b));
                        break;
                    case 3:
                        System.out.println("Hasil: " + a + " * " + b + " = " + mtk.perkalian(a, b));
                        break;
                    case 4:
                        System.out.println("Hasil: " + a + " / " + b + " = " + mtk.pembagian(a, b));
                        break;
                    case 5:
                        System.out.println("Hasil: " + a + " % " + b + " = " + mtk2.modulus(a, b));
                        break;
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");
        input.close();
    }
}