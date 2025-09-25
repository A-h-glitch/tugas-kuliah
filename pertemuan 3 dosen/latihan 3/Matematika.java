// Kelas dasar Matematika dengan method overloading
public class Matematika {

    // Pertambahan (overloading)
    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    // Pengurangan (overloading)
    public double pengurangan(double a, double b) {
        return a - b;
    }

    public double pengurangan(double a, double b, double c) {
        return a - b - c;
    }
}