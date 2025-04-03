package cours_2.classes;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> shoppingCart;

    public ShoppingCart(Product item) {
        this.shoppingCart = new ArrayList<>();
        this.shoppingCart.add(item);
    }

    public void addItemToCart(Product item) {
        this.shoppingCart.add(item);
    }

    public ArrayList<Product> getCart() {
        return this.shoppingCart;
    }

    public int totalCartAmount() {
        int total = 0;
        for(Product item : this.shoppingCart) {
            total += item.getPrice();
            total += item.getShippingCost();
        }

        return total;
    }

    public String totalCartAmount(String currency) {
        int total = 0;
        for(Product item : this.shoppingCart) {
            total += item.getPrice();
            total += item.getShippingCost();
        }

        return this.totalCartAmount() + currency;
    }

}
