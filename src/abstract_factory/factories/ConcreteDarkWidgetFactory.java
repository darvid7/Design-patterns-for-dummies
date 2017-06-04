package abstract_factory.factories;

import abstract_factory.scrollbar.DarkScrollBar;
import abstract_factory.window.DarkWindow;


/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteDarkWidgetFactory extends AbstractWidgetFactory {

    public ConcreteDarkWidgetFactory() {}

    public DarkWindow createWindow() {
        return new DarkWindow();
    }

    public DarkScrollBar createScrollBar() {
        return new DarkScrollBar();

    }
}
