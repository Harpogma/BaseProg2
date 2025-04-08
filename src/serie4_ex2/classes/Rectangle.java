package serie4_ex2.classes;

public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
        super.displayInfo();
    }

    @Override
    public double calculateArea() {
        return this.x * this.y;
    }

    @Override
    public double calculatePerimeter() {
        return ((this.x * 2) + (this.y * 2));
    }
}
