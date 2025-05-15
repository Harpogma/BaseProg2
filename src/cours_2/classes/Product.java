package cours_2.classes;


public abstract class Product {
    private String name;
    private int price;
    private static int counter = 0;
    private Integer id;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
        counter++;
        this.id = counter;
    }

    public Integer getId(){
        return this.id;
    }

    public static int getCounter(){
        return counter;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public static int maMethode(){
        return 3;
    }
    public abstract double getShippingCosts();

}