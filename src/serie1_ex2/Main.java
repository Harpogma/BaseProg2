package serie1_ex2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Renault", "Clio", 1990);
        Car car2 = new Car("Gray", "Audi", "A5", 2014);

        car1.changeGear(3);
        car2.changeGear(4);
        car1.changeGear(5);
        car2.changeGear(1);

    }
}
