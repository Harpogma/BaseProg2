package serie3_ex5;

import serie3_ex5.classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Locomotive loco = new Locomotive(10);
        FreightWagon goods1 = new FreightWagon(23, "Avocats", 2000);
        FreightWagon goods2 = new FreightWagon(25, "Coffee", 1400);
        PassengerWagon pass1 = new PassengerWagon(23, 65);
        PassengerWagon pass2 = new PassengerWagon(36, 71);

        ArrayList<Wagon> trainComposition = new ArrayList<>();
        Train train1 = new Train(trainComposition);

        train1.addWagon(loco, 0);

        train1.addWagon(goods1, 1);

        train1.addWagon(loco, 2);

        train1.printComposition();

    }

}

