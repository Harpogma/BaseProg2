package serie4_ex2.classes;

abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Area: "+ String.format("%.2f", this.calculateArea()));
        System.out.println("Perimeter: "+ String.format("%.2f", this.calculatePerimeter()));
        System.out.println();
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
