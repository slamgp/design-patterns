package behavioral.observer;

import behavioral.observer.observable.DollarRate;
import behavioral.observer.observable.IObservable;
import behavioral.observer.observer.BostonStockExchange;
import behavioral.observer.observer.LondonStockExchange;
import behavioral.observer.observer.ShanghaiStockExchange;

public class EntryPoint {

    public static void main(String[] args) {
        IObservable dolarRate = new DollarRate();
        dolarRate.addObserver(new LondonStockExchange());
        dolarRate.addObserver(new ShanghaiStockExchange());
        dolarRate.addObserver(new BostonStockExchange());
        dolarRate.notifyObservers();
        System.out.println("-----------------------");
        dolarRate.notifyObservers();
        System.out.println("-----------------------");
        dolarRate.removeObserver(1);
        dolarRate.notifyObservers();
        
        System.out.println(20%20);
        System.out.println(20%21);

        System.out.println(20%19);
        System.out.println(40%20);

    }

}
