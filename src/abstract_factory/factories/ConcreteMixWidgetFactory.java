package abstract_factory.factories;

import abstract_factory.scrollbar.DarkScrollBar;
import abstract_factory.window.LightWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteMixWidgetFactory extends AbstractWidgetFactory {

    public ConcreteMixWidgetFactory() {}

    public LightWindow createWindow() {
        return new LightWindow();
    }

    public DarkScrollBar createScrollBar() {
        return new DarkScrollBar();

    }
}
