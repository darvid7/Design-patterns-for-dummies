package observer.observer_params;

import observer.observer_params.observer.ConcreteObserver;
import observer.observer_params.observerable.ConcreteObservableSubject;

import java.util.Random;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class Driver {

    public static void main(String[] args) {
        // This has the same UML diagram as the traditional observer without the association from ConcreteObserver to ConcreteSubject.
        ConcreteObservableSubject observable = new ConcreteObservableSubject();
        // Note: How the ConcreteObserver does not need to know about the observable anymore.
        ConcreteObserver observerFoo = new ConcreteObserver("Foo");
        ConcreteObserver observerBar = new ConcreteObserver("Bar");

        observable.attach(observerFoo);
        observable.attach(observerBar);

        Random generator = new Random();

        for (int i = 0; i < 50; i++) {
            int randInt = generator.nextInt();
            observable.setState(randInt);  // Should trigger the upated method in ConcreteObserver.
        }

    }
}
