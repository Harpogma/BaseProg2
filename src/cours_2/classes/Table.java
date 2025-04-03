package cours_2.classes;

public class Table extends Product {
    private int weight;
    private int shippingCost;


    public Table(String product, int price, int shippingCost, int weight) {
        super(product, price);
        this.weight = weight;
        this.shippingCost = shippingCost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getShippingCost() {
        if (this.weight < 100) {
            return 19;
        } else if (this.weight >= 100 && this.weight < 500) {
            return 39;
        } else {
            return 59;
        }
    }

    @Override
    public String toString() {
        return "La table " + this.getProduct() + " a un poids de " + this.weight;
    }
}
