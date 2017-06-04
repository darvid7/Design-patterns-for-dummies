package observer.observer_params.observerable;

import observer.observer_params.observer.AbstractObserver;

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

    public abstract void notifyObservers();
}
