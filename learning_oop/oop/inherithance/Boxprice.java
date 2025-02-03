package inherithance;

public class Boxprice extends Boxweight {
    int price;

    Boxprice() {
        this.price = 50;
    }

    Boxprice(int price, double weight, double l, double h, double w) {
        super(l, h, w, weight);
        this.price = price;
    }
}
