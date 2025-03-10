package cours_2.classes;

public class CreditCard {
    private String type;
    private long ccNumber;

    public CreditCard(String type, long ccNumber) {
        this.type = type;
        this.ccNumber = ccNumber;
    }

    public String getType() {
        return type;
    }

    public long getCcNumber() {
        return ccNumber;
    }
}
