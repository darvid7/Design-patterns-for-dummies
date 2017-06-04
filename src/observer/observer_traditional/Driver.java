package observer.observer_traditional;

import observer.observer_traditional.observable.ConcreteObservableSubject;
import observer.observer_traditional.observer.ConcreteObserver;

import java.util.Random;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class Driver {

    public static void main(String[] args) {
        ConcreteObservableSubject observable = new ConcreteObservableSubject();
        ConcreteObserver observerThatResponsesToUpdates = new ConcreteObserver(observable);
        observable.attach(observerThatResponsesToUpdates);

        Random generator = new Random();

        for (int i = 0; i < 50; i++) {
            int randInt = generator.nextInt();
            observable.setState(randInt);  // Should trigger the upated method in ConcreteObserver.
        }

    }
}
