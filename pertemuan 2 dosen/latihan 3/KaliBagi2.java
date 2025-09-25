import java.util.Scanner;

public class KaliBagi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int x = input.nextInt();

        int kali2 = x << 1;   // kali 2
        int bagi2 = x >> 1;   // bagi 2

        System.out.println("Hasil kali 2 = " + kali2);
        System.out.println("Hasil bagi 2 = " + bagi2);

        input.close();
    }
}