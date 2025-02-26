package serie1_ex1;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer();
        printer1.isOn = true;
        Printer printer2 = new Printer();
        printer2.isOn = false;

        printer1.turnOn();
        printer2.turnOff();

        System.out.println(printer1.isOn);
        System.out.println(printer2.isOn);
    }
}