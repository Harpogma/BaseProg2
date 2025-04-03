package cours_2.classes;

public class App extends Product {
    private String version;
    private String downloadLink;

    public App(String product, int price, String version, String downloadLink) {
        super(product, price);
        this.version = version;
        this.downloadLink = downloadLink;
    }

    public String getVersion() {
        return this.version;
    }

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
    public int getShippingCost() {
        return 0;
    }

}
