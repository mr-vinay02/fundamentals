package oopsimplementation.shapeareacalculator;

public class Triangle implements Shape{

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public String shapetype() {
        return "This is a Triangle Shape";
    }
}
