package cours_2;

import cours_2.classes.*;

import java.util.ArrayList;

abstract class abstractTest {
    public abstract void test();
}

class concreteTest extends abstractTest {
    @Override
    public void test() {
        System.out.println("Yes");
    }
}

public class Main {
    public static void main(String[] args) {

//        CreditCard cb1 = new CreditCard("VISA", 1223333333333333L);
//
//        CreditCard cb2 = new CreditCard("VISA", 12345678L);
//
//        User user = new User("FirstName", "LastName", 24);
//        user.addCreditCard(cb1);
//        user.addCreditCard(cb2);
//
//        ArrayList<CreditCard> userCards = user.getCreditCards();
//        for(CreditCard card : userCards) {
//            System.out.println(card.getType() + ": " + card.getCcNumber());
//            System.out.println(card);
//        }
//
//        Product product1 = new Product("Veste", 159, 25);
//        Product product2 = new Product("Pantalon", 82, 25);

        Shoes shoes1 = new Shoes("Adidas", 129, 10, 46);
        Shoes shoes2 = new Shoes("Veja", 149, 14, 43);
        Table table1 = new Table("Belle table", 155, 14, 99);
        Table table2 = new Table("Moche table", 155, 14, 199);

        ShoppingCart cart1 = new ShoppingCart(shoes1);

        cart1.addItemToCart(shoes2);
        cart1.addItemToCart(table2);
        cart1.addItemToCart(table1);

        System.out.println("Le prix total est de " + cart1.totalCartAmount(" CHF"));

        System.out.println("le prix de livraison est de : " + table1.getShippingCost());

        for(Product p : cart1.getCart()) {
            System.out.println("Frais de livraison de : " + p.getShippingCost());
            System.out.println(p.toString());
        }


    }
}