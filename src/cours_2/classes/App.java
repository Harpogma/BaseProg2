package cours_2.classes;

import java.util.Objects;

public class App extends Product implements Downloadable{
    private double version;
    private String link;

    public App(String name, int price, double version, String link) {
        super(name, price);
        this.version= version;
        this.link = link;
        //System.out.println(super.maMethode());
    }

    @Override
    public double getShippingCosts() {
        return 0;
    }

    @Override
    public String getDownloadLink() {
        return this.link;
    }

    @Override
    public double getVersion() {
        return this.version;
    }

   @Override
    public boolean equals(Object o){
        if(o instanceof App app){
            return this.getName().equals(app.getName()) && super.getPrice() == app.getPrice() &&
                    this.link.equals(app.link) && this.version == app.version;
        }
        return false;
   }

   @Override
    public int hashCode(){
        return Objects.hash(this.getName(), super.getPrice(), this.link, this.version);
   }
}
