package oopsimplementation.shapeareacalculator;

public class MainAreaCalculator {
    public static void main(String[] args) {


        // For the Circle
        Shape circle = new Circle(4.5);
        System.out.println( circle.shapetype());
        System.out.println("Area of  the  circle is "+circle.area());


        // For the Triangle
        Shape triangle = new Triangle(5.2,5);
        System.out.println(triangle.shapetype());
        System.out.println("Area of  the  triangle is "+triangle.area());


        // For the rectangle
        Shape rectangle = new Rectangle(5,5);
        System.out.println(rectangle.shapetype());
        System.out.println("Area of  the  rectangle is "+rectangle.area());




    }
}
