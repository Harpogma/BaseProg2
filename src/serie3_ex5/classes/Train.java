package serie3_ex5.classes;

import java.util.ArrayList;

public class Train {
    private boolean locomotiveFirst;
    private ArrayList<Wagon> trainComposition = new ArrayList<>();

    public Train(ArrayList<Wagon> trainComposition) {
        this.trainComposition = trainComposition;
    }

    public boolean addWagon(Wagon wagon, int placeOfWagon) {

        if(wagon instanceof Locomotive && placeOfWagon != 0) {
            System.out.println("A locomotive can only be the first wagon of the train!");
            return false;
        } else {
            this.trainComposition.add(placeOfWagon, wagon);
            System.out.println("A " + wagon.getClass().getSimpleName() + " was added in position " + placeOfWagon);
            return true;
        }
    }

    public ArrayList<Wagon> getComposition() {
        return this.trainComposition;
    }

    public boolean isLocomotiveFirst(ArrayList<Wagon> trainComposition) {
        if (!this.trainComposition.isEmpty()) {
            if (this.trainComposition.getFirst() instanceof Locomotive) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
