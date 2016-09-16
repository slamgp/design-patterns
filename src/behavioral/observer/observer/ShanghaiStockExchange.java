package behavioral.observer.observer;


public class ShanghaiStockExchange implements IObserver {

    @Override
    public void update() {
        System.out.println("Shanghai is working");     
    }

}
