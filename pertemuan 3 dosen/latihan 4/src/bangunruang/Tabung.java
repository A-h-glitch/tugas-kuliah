package bangunruang;

import bangundatar.Lingkaran;

public class Tabung extends Lingkaran {
    private double tinggi;

    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * super.hitungLuas() + super.hitungKeliling() * tinggi;
    }
}