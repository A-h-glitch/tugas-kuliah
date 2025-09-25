package bangunruang;

import bangundatar.Persegi;

public class Kubus extends Persegi {
    public Kubus(double sisi) {
        super(sisi);
    }

    public double hitungVolume() {
        return Math.pow(super.hitungLuas(), 1.5); // sisi^3
    }

    public double hitungLuasPermukaan() {
        return 6 * super.hitungLuas();
    }
}