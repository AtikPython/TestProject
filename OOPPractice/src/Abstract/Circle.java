package Abstract;

public class Circle extends Shape {

    Circle(double red) {
        super(red, red);
    }
    @Override
    void area() {
        double result = Math.PI * d1 * d2;
        System.out.println("Circle: " + result);
    }
}
