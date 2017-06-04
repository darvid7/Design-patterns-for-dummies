package observer.observer_traditional.observable;

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

    // Get state of observable.
    public int getState() {
        return this.state;
    }


}
