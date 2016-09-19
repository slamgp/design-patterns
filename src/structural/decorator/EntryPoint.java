package structural.decorator;

import structural.decorator.decorator.BaseCarPrice;
import structural.decorator.decorator.ComforPrice;
import structural.decorator.decorator.ICarPrice;

public class EntryPoint {

    public static void main(String[] args) {
        ICarPrice carPrice = new BaseCarPrice(22000);
        ICarPrice carPriceComfort = new ComforPrice(carPrice, 1500);
        ICarPrice carPricePremium = new ComforPrice(carPriceComfort, 1500);
        System.out.println("carPrice = " + carPrice.getPrice());
        System.out.println("carPriceComfort = " + carPriceComfort.getPrice());
        System.out.println("carPricePremium = " + carPricePremium.getPrice());
    }

}
