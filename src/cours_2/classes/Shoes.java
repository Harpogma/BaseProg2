package cours_2.classes;

import java.util.Iterator;

public class Shoes extends Product implements Wearable{
    private int size;
    private int shippingCosts = 9;


    public Shoes(String name, int price, int size){
        super(name, price);
        this.size = size;
    }

    @Override
    public int getSize(){
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return super.toString() + ", Shoes " + this.getName() + ", " + this.size;
    }

    @Override
    public double getShippingCosts(){
        return this.shippingCosts ;
    }

   /*@Override
    public boolean equals(Object o){
        if(o instanceof Shoes){
            return this.getName().equals(((Shoes) o).getName()) && this.getPrice() == ((Shoes) o).getPrice() &&
                    this.size == ((Shoes) o).size;
        }
        return false;
    }*/
}
