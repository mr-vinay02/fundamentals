package oopsimplementation.shapeareacalculator;

public class Rectangle implements Shape
{

    double length ;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public String shapetype() {
        return "This is a Rectangle";
    }
}
