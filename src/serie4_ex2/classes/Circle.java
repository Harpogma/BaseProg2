package serie4_ex2.classes;

public class Circle extends Shape {
    final double PI = Math.PI;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        super.displayInfo();

    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
