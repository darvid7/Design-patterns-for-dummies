package abstract_factory.factories;

import abstract_factory.scrollbar.DarkScrollBar;
import abstract_factory.scrollbar.AbstractScrollBar;
import abstract_factory.window.DarkWindow;
import abstract_factory.window.AbstractWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteDarkWidgetFactory extends AbstractWidgetFactory {

    public ConcreteDarkWidgetFactory() {}

    public AbstractWindow createWindow() {
        return new DarkWindow();
    }

    public AbstractScrollBar createScrollBar() {
        return new DarkScrollBar();

    }
}
