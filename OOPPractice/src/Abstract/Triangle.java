package Abstract;

public class Triangle extends Shape {

    Triangle(double d1, double d2) {
        super(d1, d2);
    }
    @Override
    void area() {
        double result = 0.5 * d1 * d2;
        System.out.println("Triangle: " + result);
    }

}
