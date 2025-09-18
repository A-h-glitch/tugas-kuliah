public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double f) {
        double c = (f - 32) * 5 / 9; // Fahrenheit ke Celcius
        return c * 4 / 5;            // Celcius ke Reamur
    }
}