package abstract_factory.factories;

import abstract_factory.scrollbar.AbstractScrollBar;
import abstract_factory.window.AbstractWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public abstract class AbstractWidgetFactory {
    public abstract AbstractWindow createWindow();
    public abstract AbstractScrollBar createScrollBar();
}
