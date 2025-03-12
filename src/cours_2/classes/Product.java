package cours_2.classes;

public class Product {
    private String product;
    private int price;
    private int shippingCost;

    public Product(String product, int price, int shippingCost) {
        this.product = product;
        this.price = price;
        this.shippingCost = shippingCost;
    }

    public String getProduct() {
        return this.product;
    }

    public int getPrice() {
        return this.price;
    }

    public int getShippingCost() {
        return this.shippingCost;
    }
}
