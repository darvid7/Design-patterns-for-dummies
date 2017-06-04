package abstract_factory;

import abstract_factory.factories.AbstractWidgetFactory;
import abstract_factory.scrollbar.ScrollBar;
import abstract_factory.window.Window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ApplicationClient {
    public ApplicationClient() {}

       public void createWidget(AbstractWidgetFactory factory) {
           Window w = factory.createWindow();
           ScrollBar s = factory.createScrollBar();

           System.out.println("Client created: " + w.getDescription() + ", " + s.getDescription());
       }
}