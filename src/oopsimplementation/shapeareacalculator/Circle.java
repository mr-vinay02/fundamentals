package oopsimplementation.shapeareacalculator;

public class Circle implements Shape{

    double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public String shapetype() {
        return "This is a Circle";
    }
}
