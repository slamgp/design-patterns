package behavioral.observer.observer;


public class LondonStockExchange implements IObserver {

    @Override
    public void update() {
        System.out.println("London is working");
    }

}
