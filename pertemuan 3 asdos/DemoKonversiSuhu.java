import java.util.Scanner;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KonversiSuhu ks1 = new KonversiSuhu();
        KonversiSuhu2 ks2 = new KonversiSuhu2();

        int pilihan;
        do {
            System.out.println("\n=== Program Konversi Suhu ===");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Celcius ke Reamur");
            System.out.println("3. Fahrenheit ke Reamur");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan suhu dalam Celcius: ");
                double c = input.nextDouble();
                System.out.println(c + " °C = " + ks1.celciusToFahrenheit(c) + " °F");
            } else if (pilihan == 2) {
                System.out.print("Masukkan suhu dalam Celcius: ");
                double c = input.nextDouble();
                System.out.println(c + " °C = " + ks1.celciusToReamur(c) + " °R");
            } else if (pilihan == 3) {
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                double f = input.nextDouble();
                System.out.println(f + " °F = " + ks2.fahrenheitToReamur(f) + " °R");
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");
        input.close();
    }
}