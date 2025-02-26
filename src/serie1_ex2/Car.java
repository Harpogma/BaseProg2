package serie1_ex2;

public class Car {
    String color;
    String Brand;
    String model;
    int year;
    int gear;

    void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Your gear is now " + gear);
    }

    Car (String color, String Brand, String model, int year) {}
}
