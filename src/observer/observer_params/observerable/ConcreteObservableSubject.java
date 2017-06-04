package observer.observer_params.observerable;

import observer.observer_params.observer.AbstractObserver;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteObservableSubject extends AbstractObservableSubject {
    private int state = 0;

    // State has changed, notify after state changed.
    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }

    public void notifyObservers() {
        for (AbstractObserver observer: observers) {
            observer.update(this.state);
        }
    }

}
