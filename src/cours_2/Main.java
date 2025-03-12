package cours_2;

import cours_2.classes.CreditCard;
import cours_2.classes.Product;
import cours_2.classes.ShoppingCart;
import cours_2.classes.User;
import cours_2.classes.Shoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CreditCard cb1 = new CreditCard("VISA", 1223333333333333L);

        CreditCard cb2 = new CreditCard("VISA", 12345678L);

        User user = new User("FirstName", "LastName", 24);
        user.addCreditCard(cb1);
        user.addCreditCard(cb2);

        ArrayList<CreditCard> userCards = user.getCreditCards();
        for(CreditCard card : userCards) {
            System.out.println(card.getType() + ": " + card.getCcNumber());
            System.out.println(card);
        }

        Product product1 = new Product("Veste", 159, 25);
        Product product2 = new Product("Pantalon", 82, 25);

        Shoes shoes1 = new Shoes("Adidas", 129, 10, 46);

        ShoppingCart cart1 = new ShoppingCart(product1);
        cart1.addItemToCart(product2);
        cart1.addItemToCart(shoes1);
        System.out.println(shoes1.getPrice());

        System.out.println("Le prix total est de " + cart1.totalCartAmount());

    }
}