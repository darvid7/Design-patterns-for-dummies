package abstract_factory;

import abstract_factory.factories.AbstractWidgetFactory;
import abstract_factory.factories.ConcreteDarkWidgetFactory;
import abstract_factory.factories.ConcreteLightWidgetFactory;

import java.util.Random;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class Driver {
    public static void main(String[] args) {
        ApplicationClient app = new ApplicationClient();

        AbstractWidgetFactory currentFactory = new ConcreteDarkWidgetFactory();
        app.createWidget(currentFactory);

        AbstractWidgetFactory anotherFactory = new ConcreteLightWidgetFactory();
        app.createWidget(anotherFactory);

        // At run time can randomize which factory it uses and it should work fine.
        // This is because we use dependency inversion to make it rely on the high level abstractions
        // so it isn't tied to concrete implementations.
        // Additionally as we inject the factory, the ApplicationClient class doesn't need to know
        // or be tied to a concrete implementation. Also shows use of Liskov substitution principle and
        // Open/Closed principle.

        Random generator = new Random();

        for (int i = 0; i < 10; i++) {
            int j = generator. nextInt();

            System.out.println("Iteration: " + i);
            if (j % 2 == 0) {
                // Is even;
                app.createWidget(new ConcreteLightWidgetFactory());
            } else {
                app.createWidget(new ConcreteDarkWidgetFactory());
            }
        }

    }
}
