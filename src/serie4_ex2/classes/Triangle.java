package serie4_ex2.classes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(String name, double a, double b, double c, double height) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
        super.displayInfo();
    }

    @Override
    public double calculateArea() {
        return this.c * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
