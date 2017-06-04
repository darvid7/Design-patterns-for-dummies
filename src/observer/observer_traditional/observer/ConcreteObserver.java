package observer.observer_traditional.observer;

import observer.observer_traditional.observable.ConcreteObservableSubject;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteObserver extends AbstractObserver {
    // Knows about concrete implementation.
    ConcreteObservableSubject observable;

    public ConcreteObserver(ConcreteObservableSubject observable) {
        System.out.println("Creating observer that responses to observable updates");
        this.observable = observable; // Set subject which is observed and changes state.
    }

    public void update() {

        int newState = observable.getState();
        System.out.println("update(): New state from observable subject: " + newState);
    }
}
