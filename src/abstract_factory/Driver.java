package abstract_factory;

import abstract_factory.factories.AbstractWidgetFactory;
import abstract_factory.factories.ConcreteDarkWidgetFactory;
import abstract_factory.factories.ConcreteLightWidgetFactory;
import abstract_factory.factories.ConcreteMixWidgetFactory;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class Driver {
    public static void main(String[] args) {
        ApplicationClient app = new ApplicationClient();
        ArrayList<ConcreteWidget> myWidgets = new ArrayList<>();

        AbstractWidgetFactory currentFactory = new ConcreteDarkWidgetFactory();
        ConcreteWidget newWidget =  app.createWidget(currentFactory);
        myWidgets.add(newWidget);

        AbstractWidgetFactory anotherFactory = new ConcreteLightWidgetFactory();
        ConcreteWidget anotherWidget = app.createWidget(anotherFactory);
        myWidgets.add(anotherWidget);

        // Lets say a widget is composed of a scrollbar and window.

        // At run time can randomize which factory it uses and it should work fine.
        // This is because we use dependency inversion to make it rely on the high level abstractions
        // so it isn't tied to concrete implementations.
        // Additionally as we inject the factory, the ApplicationClient class doesn't need to know
        // or be tied to a concrete implementation. Also shows use of Liskov substitution principle and
        // Open/Closed principle.

        Random generator = new Random();

        for (int i = 0; i < 3; i++) {
            int j = generator. nextInt();

            System.out.println("Iteration: " + i);
            if (j % 2 == 0) {
                // Is even;
                myWidgets.add(app.createWidget(new ConcreteLightWidgetFactory()));
            } else {
                myWidgets.add(app.createWidget(new ConcreteDarkWidgetFactory()));
            }
        }
        // Mixed widget was added really easily.
        ConcreteWidget mixedWidget = app.createWidget(new ConcreteMixWidgetFactory());
        myWidgets.add(mixedWidget);

        System.out.println("Created: " + myWidgets.size() + " widgets");

    }
}
