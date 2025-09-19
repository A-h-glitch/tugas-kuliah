import java.util.Scanner;

public class Main {

    // Kelas Balok
    static class Balok extends BangunRuang {
        private double panjang, lebar, tinggi;

        public Balok(double panjang, double lebar, double tinggi) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }

        public void setUkuran(double panjang, double lebar, double tinggi) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }

        @Override
        public double hitungVolume() {
            return panjang * lebar * tinggi;
        }

        @Override
        public double hitungLuasPermukaan() {
            return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        }
    }

    // Kelas Kubus
    static class Kubus extends BangunRuang {
        private double sisi;

        public Kubus(double sisi) {
            this.sisi = sisi;
        }

        public void setSisi(double sisi) {
            this.sisi = sisi;
        }

        @Override
        public double hitungVolume() {
            return sisi * sisi * sisi;
        }

        @Override
        public double hitungLuasPermukaan() {
            return 6 * sisi * sisi;
        }
    }

    // Program utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Balok
        Balok balok = new Balok(5, 3, 4);
        System.out.println("=== BALOK ===");
        System.out.println("Volume awal: " + balok.hitungVolume());
        System.out.println("Luas Permukaan awal: " + balok.hitungLuasPermukaan());

        System.out.print("\nMasukkan panjang baru: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar baru: ");
        double l = input.nextDouble();
        System.out.print("Masukkan tinggi baru: ");
        double t = input.nextDouble();

        balok.setUkuran(p, l, t);
        System.out.println("Volume baru: " + balok.hitungVolume());
        System.out.println("Luas Permukaan baru: " + balok.hitungLuasPermukaan());

        // Kubus
        Kubus kubus = new Kubus(4);
        System.out.println("\n=== KUBUS ===");
        System.out.println("Volume awal: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan awal: " + kubus.hitungLuasPermukaan());

        System.out.print("\nMasukkan sisi baru: ");
        double s = input.nextDouble();

        kubus.setSisi(s);
        System.out.println("Volume baru: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan baru: " + kubus.hitungLuasPermukaan());

        input.close();
    }
}