package abstract_factory;

import abstract_factory.factories.AbstractWidgetFactory;
import abstract_factory.scrollbar.AbstractScrollBar;
import abstract_factory.window.AbstractWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ApplicationClient {
    public ApplicationClient() {}

    public ConcreteWidget createWidget(AbstractWidgetFactory factory) {
        // Even though the window and scrollbar is either dark or light we don't care as we
        // treat it as it's base class (upper most class in the hierarchy).
        AbstractWindow w = factory.createWindow();
        AbstractScrollBar s = factory.createScrollBar();

        ConcreteWidget widget = new ConcreteWidget(s, w);
        System.out.println("Client created: " + widget.getDescription());
        return widget;
    }
}