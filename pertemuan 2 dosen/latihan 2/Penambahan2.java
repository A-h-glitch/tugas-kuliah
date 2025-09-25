import java.util.Scanner;

public class Penambahan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w, x, y, z;
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();
        System.out.print("Masukkan nilai w: ");
        w = input.nextInt();

        y = 8 - x++;
        z = 8 - ++w;

        System.out.println("x = " + x);
        System.out.println("w = " + w);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        input.close();
    }
}