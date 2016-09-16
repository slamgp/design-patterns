package behavioral.observer.observable;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.observer.IObserver;

public class DollarRate implements IObservable {

    List<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void removeObserver(int id) {
        if (id > 0 && id < observers.size()) {
            observers.remove(id);
        }
        
    }

}
