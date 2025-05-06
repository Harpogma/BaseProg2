package cours_2;

import cours_2.classes.*;

import java.math.BigDecimal;
import java.util.*;

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
        System.out.println(shoes1.count);

        Shoes shoes2 = new Shoes("Veja", 149, 14, 43);
        System.out.println(shoes1.count);

        Table table1 = new Table("Belle table", 155, 14, 99);
        System.out.println(shoes1.count);

        Table table2 = new Table("Moche table", 155, 14, 199);
        System.out.println(shoes1.count);

        ShoppingCart cart1 = new ShoppingCart(shoes1);

        cart1.addItemToCart(shoes2);
        cart1.addItemToCart(table2);
        cart1.addItemToCart(table1);

        System.out.println("Le prix total est de " + cart1.totalCartAmount(" CHF"));

        System.out.println("le prix de livraison est de : " + table1.getShippingCost());

        App app1 = new App("Petit bamboo", 19, "v1.2", "https://www.petitbamboo.com");
        System.out.println(app1.getVersion());
        cart1.addItemToCart(app1);

        for(Product p : cart1.getCart()) {
            if (p instanceof Downloadable) {
                System.out.println("Download here: " + ((Downloadable)p).getDownloadLink());
            }
            System.out.println("Frais de livraison de : " + p.getShippingCost());
            System.out.println(p.toString());
        }

        Integer i = Integer.valueOf(3);
        Double d = Double.valueOf(3.5);
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(3);

        double d1 = 0.1;
        double d2 = 0.2;
        double d3 = d1 + d2;
        System.out.println(d3);

        BigDecimal d4 = BigDecimal.valueOf(0.1);
        BigDecimal d5 = BigDecimal.valueOf(0.2);
        System.out.println(d4.add(d5));

        Shoes shoes4 = new Shoes("Veja", 357, 10, 46);

        Shoes shoes5 = shoes4;
        shoes5.setSize(43);

        System.out.println(shoes5==shoes4);
        System.out.println(shoes5.equals(shoes4));

        Shoes shoes6 = new Shoes("Veja", 229, 10, 43);

        System.out.println(shoes4==shoes6);
        System.out.println(shoes4.equals(shoes6));


        App app2 = new App("Komoot", 23, "v1.1", "https://www.komoot.com");
        App app3 = new App("Komoot", 23, "v1.1", "https://www.komoot.com");

        System.out.println(app2.equals(app3));

        ArrayList<Product> shoesList = new ArrayList<>();
        shoesList.add(shoes4);
        shoesList.add(shoes5);
        shoesList.add(shoes6);
        System.out.println(Shoes.find(shoesList, shoes4));

        ArrayList<Shoes> productList = new ArrayList<>();
        productList.add(shoes4);
        productList.add(shoes5);
        productList.add(shoes6);

        Iterator<Shoes> it = productList.iterator();
        System.out.println(productList.size());
        while (it.hasNext()) {
            Shoes s = it.next();
            if (s.getPrice() > 200) {
                it.remove();
            }
        }


        System.out.println(productList.size());

//        long time1 = System.currentTimeMillis();
//        List<Integer> testArrayList = new ArrayList<>();
//        for (int j = 0; j < 300000; j++) {
//            testArrayList.addFirst(j);
//        }
//        long time2 = System.currentTimeMillis();
//        System.out.println(time2 - time1);
//
//        long time3 = System.currentTimeMillis();
//        List<Integer> testLinkedList = new LinkedList<>();
//        for (int j = 0; j < 300000; j++) {
//            testLinkedList.addFirst(j);
//        }
//        long time4 = System.currentTimeMillis();
//        System.out.println(time4 - time3);

        Deque<String> monDeque = new ArrayDeque<>();
        monDeque.push("first");
        monDeque.push("second");
        monDeque.push("third");
        System.out.println(monDeque.size());
        System.out.println(monDeque.pop());
        System.out.println(monDeque.size());
        monDeque.clear();

        monDeque.add("first");
        monDeque.add("second");
        monDeque.add("third");
        System.out.println(monDeque.size());
        System.out.println(monDeque.poll());
        System.out.println(monDeque.size());
        monDeque.clear();

    }
}