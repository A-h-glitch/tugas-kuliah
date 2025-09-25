public class MatematikaCanggih extends Matematika {
    public int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Modulus dengan nol!");
            return 0;
        }
    }
}