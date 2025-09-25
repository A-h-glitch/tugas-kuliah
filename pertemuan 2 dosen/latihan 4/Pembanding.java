import java.util.Scanner;

public class Pembanding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur (age): ");
        int age = input.nextInt();

        boolean hasilBanding1 = age < 25;
        boolean hasilBanding2 = age != 26;

        System.out.println("Hasil Banding 1 (age < 25): " + hasilBanding1);
        System.out.println("Hasil Banding 2 (age != 26): " + hasilBanding2);

        input.close();
    }
}