package abstract_factory.factories;

import abstract_factory.scrollbar.LightScrollBar;
import abstract_factory.scrollbar.ScrollBar;
import abstract_factory.window.LightWindow;
import abstract_factory.window.Window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteLightWidgetFactory extends AbstractWidgetFactory {

    public ConcreteLightWidgetFactory() {}

    public Window createWindow() {
        return new LightWindow();
    }

    public ScrollBar createScrollBar() {
        return new LightScrollBar();

    }
}
