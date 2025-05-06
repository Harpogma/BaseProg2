package cours_2.classes;

public class Licence extends Product implements Downloadable {
    private String version;
    private String downloadLink;

    public Licence(String product, int price, String version, String downloadLink) {
        super(product, price);
        this.version = version;
        this.downloadLink = downloadLink;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public void setversion(String version) {
        this.version = version;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public String toString() {
        return super.toString() + ", licence version " + this.version;
    }

    @Override
    public int getShippingCost() {
        return 0;
    }
}
