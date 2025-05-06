package cours_2.classes;

public class App extends Product implements Downloadable {
    private String version;
    private String downloadLink;

    public App(String product, int price, String version, String downloadLink) {
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
    public int getShippingCost() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof App) {
            return this.version.equals(((App) o).getVersion()) && this.downloadLink.equals(((App) o).getDownloadLink()) && (super.getPrice() == ((App) o).getPrice()) && super.getProduct().equals(((App) o).getProduct());
        } else {
            return false;
        }
    }
}
