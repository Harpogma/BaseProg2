package cours_2.classes;

import java.util.ArrayList;

public abstract class Product {
    private String product;
    private int price;
    public static int count = 0;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public String getProduct() {
        return this.product;
    }

    public int getPrice() {
        return this.price;
    }

    public abstract int getShippingCost();

}
