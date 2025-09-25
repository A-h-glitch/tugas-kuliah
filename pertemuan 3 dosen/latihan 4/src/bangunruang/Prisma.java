package bangunruang;

import bangundatar.Segitiga;

public class Prisma extends Segitiga {
    private double tinggi;

    public Prisma(double alas, double tinggiSegitiga, double sisiA, double sisiB, double sisiC, double tinggi) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan() {
        return (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggi);
    }
}