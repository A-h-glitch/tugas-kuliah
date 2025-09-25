import java.util.Scanner;

public class Pengurangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z;
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();

        y = x--;
        System.out.println("Setelah y = x--:");
        System.out.println("x = " + x + ", y = " + y);

        z = --x;
        System.out.println("Setelah z = --x:");
        System.out.println("x = " + x + ", z = " + z);

        input.close();
    }
}