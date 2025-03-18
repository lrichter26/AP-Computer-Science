package Unit9;

public class Triangle extends Polygon {
    private double area;
    public Triangle(int sideLength1, int sideLength2, int sideLength3) {
        super(sideLength1, sideLength2, sideLength3);
        double semi = (sideLength1 + sideLength2 + sideLength3)/2;
        area = Math.sqrt(semi * (semi - sideLength1) * (semi - sideLength2) * (semi - sideLength3));
    }
    public double getArea() {
        return area;
    }
}
