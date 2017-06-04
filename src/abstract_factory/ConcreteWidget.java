package abstract_factory;

import abstract_factory.scrollbar.AbstractScrollBar;
import abstract_factory.window.AbstractWindow;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class ConcreteWidget {

    private AbstractWindow w;
    private AbstractScrollBar sb;

    public ConcreteWidget(AbstractScrollBar sb, AbstractWindow w) {
        this.w = w;
        this.sb = sb;
    }

    public String getDescription() {
        return "I'm a widget, I have: " + this.w.getDescription() + ", " + this.sb.getDescription();
    }
}
