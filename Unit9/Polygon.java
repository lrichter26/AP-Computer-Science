package Unit9;


public class Polygon {
    private double[] sideLengths;
    public Polygon(double... sides) {
        sideLengths = sides;
    }
    public Polygon(int sides, double sideLength) {
        sideLengths = new double[sides];
        for (int i = 0; i < sides; i++) {
            sideLengths[i] = sideLength;
        }
    }
    public double[] getSideLengths() {
        return sideLengths;
    }
    public int getNumberOfSides() {
        return sideLengths.length;
    }
    public String toString() {
        return sideLengths.length + " sided polygon";
    }
}