package behavioral.observer.observable;

import behavioral.observer.observer.IObserver;

public interface IObservable {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void removeObserver(int id);

    void notifyObservers();
}
