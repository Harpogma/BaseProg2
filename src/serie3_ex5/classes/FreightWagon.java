package serie3_ex5.classes;

public class FreightWagon extends Wagon {
    private String goods;
    private int quantity;

    public FreightWagon(int length, String goods, int quantity) {
        super(length);
        this.goods = goods;
        this.quantity = quantity;
    }
}
