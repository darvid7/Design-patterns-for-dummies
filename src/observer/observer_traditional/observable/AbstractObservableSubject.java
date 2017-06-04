package observer.observer_traditional.observable;

import observer.observer_traditional.observer.AbstractObserver;

import java.util.ArrayList;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public abstract class AbstractObservableSubject {
    protected ArrayList<AbstractObserver> observers;

    public AbstractObservableSubject() {
        this.observers = new ArrayList<>();
    }

    public void attach(AbstractObserver observer) {
        this.observers.add(observer);
    }

    public void detach(AbstractObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (AbstractObserver observer: observers) {
            observer.update();
        }
    }
}
