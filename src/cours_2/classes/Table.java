package cours_2.classes;




public class Table extends Product {
    private double weight;

    public Table(String name, int price, double weight) {
        super(name, price);
        setWeight(weight);

    }

    public void setWeight(double wt){
        this.weight = wt;
    }
    @Override
    public String toString(){
        return "Table: " + this.weight;
    }

    @Override
    public double getShippingCosts(){
        System.out.println("Yooo");
        return this.weight *30;
    }
}
