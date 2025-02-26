package serie1_ex2;

public class Car {
    String color;
    String Brand;
    String model;
    int year;
    int gear;

    void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Your gear is now " + this.gear);
    }

    Car (String color, String Brand, String model, int year) {
        this.color = color;
        this.Brand = Brand;
        this.model = model;
        this.year = year;
    }
}
