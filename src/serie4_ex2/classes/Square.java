package serie4_ex2.classes;

public class Square extends Shape{
    private double x;

    public Square(String name, double x) {
        super(name);
        this.x = x;
        super.displayInfo();
    }


    @Override
    public double calculateArea() {
        return this.x * this.x;
    }

    @Override
    public double calculatePerimeter() {
        return this.x * 4;
    }
}
