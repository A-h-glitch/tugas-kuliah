// Inherit dari Matematika
public class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulus dengan nol!");
            return 0;
        }
        return a % b;
    }
}