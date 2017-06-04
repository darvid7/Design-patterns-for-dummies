package abstract_factory.factories;

import abstract_factory.scrollbar.LightScrollBar;
import abstract_factory.scrollbar.AbstractScrollBar;
import abstract_factory.window.AbstractWindow;
import abstract_factory.window.LightWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteLightWidgetFactory extends AbstractWidgetFactory {

    public ConcreteLightWidgetFactory() {}

    public AbstractWindow createWindow() {
        return new LightWindow();
    }

    public AbstractScrollBar createScrollBar() {
        return new LightScrollBar();

    }
}
