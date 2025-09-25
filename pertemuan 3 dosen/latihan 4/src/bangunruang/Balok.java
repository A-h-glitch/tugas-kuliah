package bangunruang;

import bangundatar.PersegiPanjang;

public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (super.hitungLuas() + (getPanjang() * tinggi) + (getLebar() * tinggi));
    }

    // getter untuk panjang & lebar agar bisa dipakai
    private double getPanjang() {
        return super.hitungKeliling() / 2 - getLebar();
    }

    private double getLebar() {
        return super.hitungLuas() / getPanjang();
    }
}