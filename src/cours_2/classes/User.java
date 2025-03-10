package cours_2.classes;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<CreditCard> creditCards;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.creditCards = new ArrayList<>();
    }

    public void addCreditCard(CreditCard cc) {
        this.creditCards.add(cc);
    }

    public ArrayList<CreditCard> getCreditCards() {
        return this.creditCards;
    }
}
