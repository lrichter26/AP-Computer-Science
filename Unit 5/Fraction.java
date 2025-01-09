public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public double getDecimal() {
        return (double) numerator / denominator;
    }
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        }
        else {
            return numerator + "/" + denominator;
        }
    }
    public void reduceFraction() {
        if (numerator % denominator == 0) {
            numerator /= denominator;
            denominator = 1;
        }
        else if (numerator > denominator) {
            for (int i = 1; i < denominator; i++) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    i = 1;
                }
            }
        }
        else {
            for (int i = 1; i < numerator; i++) {
                if (numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                    i = 1;
                }
            }
        }
    }
    public void multiply(Fraction in) {
        this.numerator *= in.numerator;
        this.denominator *= in.denominator;
    }
    public static Fraction multiply(Fraction in1, Fraction in2) {
        return new Fraction(in1.numerator * in2.numerator, in1.denominator * in2.denominator);
    }
    public static void main(String args[]) {
        Fraction f1 = new Fraction(100, 50);
        Fraction f2 = new Fraction(119, 47);
        Fraction f3 = Fraction.multiply(f1, f2);
        System.out.println(f1);
        f1.reduceFraction();
        System.out.println(f1);
        System.out.println(f2);
        f2.reduceFraction();
        System.out.println(f2);
        System.out.println(f3);
        f3.reduceFraction();
        System.out.println(f3);

    }
}
