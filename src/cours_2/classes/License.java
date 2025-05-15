package cours_2.classes;

import java.util.Objects;

public class License extends Product implements Downloadable {
    private double version;
    private String link;


    public License(String name, int price,  double version, String link) {
        super(name, price);
        this.version = version;
        this.link = link;
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
    public boolean equals(Object o) {
        if (o instanceof License license) {
            return this.getName().equals(license.getName()) && super.getPrice() == license.getPrice() &&
                    this.link.equals(license.link) && this.getVersion() == license.getVersion();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), super.getPrice(), this.getDownloadLink(), this.getVersion());
    }
}
