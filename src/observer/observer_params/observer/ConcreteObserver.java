package observer.observer_params.observer;

// This is not used.
import observer.observer_params.observerable.ConcreteObservableSubject;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteObserver extends AbstractObserver {
    // Knows about concrete implementation.
    String name;

    public ConcreteObserver(String name) {
        this.name = name;
        System.out.println("Creating observer " + name + " that responses to observable updates");
    }

    public void update(int data) {
        System.out.println("update(with params) for observer " + this.name + " : New state from observable subject: " + data);
    }
}
