package cours_2.classes;

import java.util.ArrayList;

public class Shoes extends Product implements Wearable {
    private int size;
    private int shippingCost;

    public Shoes(String product, int price, int shippingCost, int size) {
        super(product, price);
        this.size = size;
    }

    public void setShoes(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getShippingCost() {
        return this.shippingCost;
    }

    @Override
    public String toString() {
        return "Les chaussures " + this.getProduct() + " ont une taille de " + size;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Shoes) {
            return this.getProduct().equals(((Shoes) o).getProduct()) && this.getPrice() == ((Shoes) o).getPrice()
                    && this.size == ((Shoes) o).size;
        } else {
                return true;
            }
    }

    public static boolean find(ArrayList list, Object o) {
        if (o instanceof Shoes) {
            if (list.contains(o)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
