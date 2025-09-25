// Kelas turunan dari Matematika
public class MatematikaCanggih extends Matematika {
    private String nim;
    private String nama;

    // Constructor dengan parameter NIM dan Nama
    public MatematikaCanggih(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    // Method tambahan: perkalian, pembagian, modulus
    public double perkalian(double a, double b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }

    public double modulus(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Modulus dengan nol!");
            return 0;
        }
    }
}