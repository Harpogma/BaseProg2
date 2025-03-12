package cours_2.classes;

public class Table extends Product {
    private int weight;

    public Table(String product, int price, int shippingCost, int weight) {
        super(product, price, shippingCost);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
}
