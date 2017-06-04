package abstract_factory.factories;

import abstract_factory.scrollbar.DarkScrollBar;
import abstract_factory.scrollbar.ScrollBar;
import abstract_factory.window.DarkWindow;
import abstract_factory.window.Window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteDarkWidgetFactory extends AbstractWidgetFactory {

    public ConcreteDarkWidgetFactory() {}

    public Window createWindow() {
        return new DarkWindow();
    }

    public ScrollBar createScrollBar() {
        return new DarkScrollBar();

    }
}
