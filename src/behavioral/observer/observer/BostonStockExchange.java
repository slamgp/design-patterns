package behavioral.observer.observer;


public class BostonStockExchange implements IObserver {

    @Override
    public void update() {
        System.out.println("Boston is working");
    }

}
