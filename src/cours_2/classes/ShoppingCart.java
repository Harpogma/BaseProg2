package cours_2.classes;



import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> produits = new ArrayList<>();

    public void addProduct(Product prod){
        this.produits.add(prod);
    }

    public List<Product> getCartProducts(){
        return this.produits;
    }

    public int getTotalCartPrice(){
        int total = 0;
        for(Product prod : this.produits){

            total += prod.getPrice()+ prod.getShippingCosts();
        }
        return total;
    }

    public String getTotalCartPrice(String monnaie){
        return this.getTotalCartPrice() + " " + monnaie;
    }

}

