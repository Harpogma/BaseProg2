package cours_2.classes;

public class Shoes extends Product {
    private int size;
    private int shippingCost;

    public Shoes(String product, int price, int shippingCost, int size) {
        super(product, price);
        this.size = size;
    }

    public void setShoes(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int getShippingCost() {
        return this.shippingCost;
    }

    @Override
    public String toString() {
        return "Les chaussures " + this.getProduct() + " ont une taille de " + size;
    }
}
