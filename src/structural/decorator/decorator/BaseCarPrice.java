package structural.decorator.decorator;

public class BaseCarPrice implements ICarPrice {
    protected double price;

    public BaseCarPrice(double price) {
        super();
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
