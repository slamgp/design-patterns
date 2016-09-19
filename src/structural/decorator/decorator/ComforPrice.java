package structural.decorator.decorator;

public class ComforPrice implements ICarPrice {
    protected ICarPrice carPrice;
    protected double additionalPrice;

    public ComforPrice(ICarPrice carPrice, double additionalPrice) {
        super();
        this.carPrice = carPrice;
        this.additionalPrice = additionalPrice;
    }

    @Override
    public double getPrice() {
        return carPrice.getPrice() + additionalPrice;
    }

}
