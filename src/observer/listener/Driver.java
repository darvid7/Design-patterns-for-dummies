package observer.listener;

import observer.listener.observerAsListenerInterface.OnChangeObserverCallback;
import observer.listener.observerable.ConcreteObservableSubject;

import java.util.ArrayList;


/*              UML

 OnChangeObserverCallBack <-association- ConcreteObserver
        ^                                       ^
        |                                       |
        ---association--- Driver ---association--
 */

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class Driver {

    public static void main(String[] args) {
        ConcreteObservableSubject observable = new ConcreteObservableSubject();

        // Two anon classes acting like listeners.

        // Anon object that implments interface.
        observable.attach(new OnChangeObserverCallback() {
            @Override
            public void doSomethingWithNewData (ArrayList < String > data) {
                System.out.print("From observer Foo: ");
                for (String s : data) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        });

        // Lambda.
        observable.attach((ArrayList < String > data) -> {
            System.out.print("From observer Bar: ");
            for (String s : data) {
                System.out.print(s + " ");
            }
            System.out.println();
        });

        ArrayList<String> strings = new ArrayList<>();
        strings.add("How");
        strings.add("To");
        strings.add("Be");
        strings.add("A");
        strings.add("Software Engineer");
        strings.add("101");

        // Add data to observable, should update our anon objects that implement interface OnChangeObserverCallback().
        for (String s: strings) {
            observable.addData(s);
        }

    }
}
