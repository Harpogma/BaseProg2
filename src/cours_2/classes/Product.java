package cours_2.classes;

public abstract class Product {
    private String product;
    private int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return this.product;
    }

    public int getPrice() {
        return this.price;
    }

    public abstract int getShippingCost();

}
