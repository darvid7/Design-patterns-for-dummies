package observer.listener.observerable;

import observer.listener.ObserverAsListenerInterface.OnChangeObserverCallback;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteObservableSubject extends AbstractObservableSubject {

    // Got more data.
    public void addData(String newData) {
        this.data.add(newData);
        this.notifyObservers();
    }


    public void notifyObservers() {
        for (OnChangeObserverCallback observer: observers) {
            observer.doSomethingWithNewData(this.data);
        }
    }

}
