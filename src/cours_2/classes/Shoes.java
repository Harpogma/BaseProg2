package cours_2.classes;

public class Shoes extends Product {
    private int size;

    public Shoes(String product, int price, int shippingCost, int size) {
        super(product, price, shippingCost);
        this.size = size;
    }

    public void setShoes(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}
