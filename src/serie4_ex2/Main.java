package serie4_ex2;

import serie4_ex2.classes.Circle;
import serie4_ex2.classes.Rectangle;
import serie4_ex2.classes.Square;
import serie4_ex2.classes.Triangle;

public class Main {
    public static void main(String[] args) {

        Circle cercle = new Circle("Cercle 1", 3);
        Square carre = new Square("Carré 1", 4);
        Rectangle rectangle = new Rectangle("Rectangle 1", 5, 6);
        Triangle triangle = new Triangle("Triangle 1", 3, 4, 5, 6);
    }
}
