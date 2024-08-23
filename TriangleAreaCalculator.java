import java.lang.Math;

public class TriangleAreaCalculator {
    public double calculateArea(double height, double breadth) {
        return (height * breadth) / 2;
    }
    public double calculateArea(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("The sides do not form a valid triangle.");
        }
        double p = (a + b + c) / 2; // Semi-perimeter
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double calculateArea(double a) {
        return (Math.sqrt(3) / 4) * (a * a);
    }
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        double height = 10;
        double breadth = 5;
        System.out.println("Area of triangle with height " + height + " and breadth " + breadth + " is: " +
                           calculator.calculateArea(height, breadth));
        double side1 = 5;
        double side2 = 6;
        double side3 = 7;
        System.out.println("Area of triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is: " +
                           calculator.calculateArea(side1, side2, side3));

        double sideLength = 4;
        System.out.println("Area of equilateral triangle with side length " + sideLength + " is: " +
                           calculator.calculateArea(sideLength));
    }
}
