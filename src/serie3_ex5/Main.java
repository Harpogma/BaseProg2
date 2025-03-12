package serie3_ex5;

import serie3_ex5.classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Locomotive loco = new Locomotive(10);
        FreightWagon goods1 = new FreightWagon(23, "Avocats", 2000);
        FreightWagon goods2 = new FreightWagon(25, "Café", 1400);
        PassengerWagon pass1 = new PassengerWagon(32, 67);
        PassengerWagon pass2 = new PassengerWagon(36, 71);

        ArrayList<Wagon> trainComposition = new ArrayList<>();
        trainComposition.add(loco);
        trainComposition.add(pass1);
        trainComposition.add(loco);

        Train train1 = new Train(trainComposition);
        System.out.println("nombre de wagon " + trainComposition.size());

    }
}

