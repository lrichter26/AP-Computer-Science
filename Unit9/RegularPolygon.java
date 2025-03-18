package Unit9;

public class RegularPolygon extends Polygon {
    private double area;
    public RegularPolygon(int sides, double sideLength) {
        super(sides, sideLength);
        area = (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / sides));
    }
    public double getArea() {
        return area;
    }
    public String toString() {
        return
    }
}
