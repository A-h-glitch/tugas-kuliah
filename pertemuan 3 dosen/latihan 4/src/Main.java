import bangundatar.*;
import bangunruang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double p = in.nextDouble();
        System.out.print("Masukkan lebar: ");
        double l = in.nextDouble();
        PersegiPanjang pp = new PersegiPanjang(p, l);
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());

        System.out.print("\nMasukkan sisi persegi: ");
        double s = in.nextDouble();
        Persegi persegi = new Persegi(s);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double r = in.nextDouble();
        Lingkaran ling = new Lingkaran(r);
        System.out.println("Luas Lingkaran: " + ling.hitungLuas());
        System.out.println("Keliling Lingkaran: " + ling.hitungKeliling());

        System.out.print("\nMasukkan alas segitiga: ");
        double a = in.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double t = in.nextDouble();
        System.out.print("Masukkan sisi A: ");
        double sisiA = in.nextDouble();
        System.out.print("Masukkan sisi B: ");
        double sisiB = in.nextDouble();
        System.out.print("Masukkan sisi C: ");
        double sisiC = in.nextDouble();
        Segitiga seg = new Segitiga(a, t, sisiA, sisiB, sisiC);
        System.out.println("Luas Segitiga: " + seg.hitungLuas());
        System.out.println("Keliling Segitiga: " + seg.hitungKeliling());

        // Bangun ruang
        Balok balok = new Balok(p, l, t);
        System.out.println("\nVolume Balok: " + balok.hitungVolume());

        Prisma prisma = new Prisma(a, t, sisiA, sisiB, sisiC, 10);
        System.out.println("Volume Prisma: " + prisma.hitungVolume());

        Tabung tabung = new Tabung(r, 10);
        System.out.println("Volume Tabung: " + tabung.hitungVolume());

        Kubus kubus = new Kubus(s);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
    }
}