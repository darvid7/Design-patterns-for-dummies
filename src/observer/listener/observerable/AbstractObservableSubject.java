package observer.listener.observerable;

import observer.listener.ObserverAsListenerInterface.OnChangeObserverCallback;

import java.util.ArrayList;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public abstract class AbstractObservableSubject {
    protected ArrayList<OnChangeObserverCallback> observers;
    protected ArrayList<String> data;

    public AbstractObservableSubject() {
        this.observers = new ArrayList<>();
        this.data = new ArrayList<>();
        this.data.add("FIT3077");
    }

    public void attach(OnChangeObserverCallback observer) {
        this.observers.add(observer);
    }

    public void detach(OnChangeObserverCallback observer) {
        this.observers.remove(observer);
    }

    public abstract void notifyObservers();
}
