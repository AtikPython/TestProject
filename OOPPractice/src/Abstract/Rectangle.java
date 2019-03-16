package Abstract;

public class Rectangle extends Shape {

    Rectangle(double d1, double d2) {
        super(d1, d2);
    }
    @Override
    void area() {
        double result = d1 * d2;
        System.out.println("Rectangle: " + result);
    }

}
