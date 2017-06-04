package abstract_factory.factories;

import abstract_factory.scrollbar.ScrollBar;
import abstract_factory.window.Window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public abstract class AbstractWidgetFactory {
    public abstract Window createWindow();
    public abstract ScrollBar createScrollBar();
}
