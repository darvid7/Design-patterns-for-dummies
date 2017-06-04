package abstract_factory.scrollbar;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class LightScrollBar extends AbstractScrollBar {

    public LightScrollBar() {
        this.description = "Light scrollbar";

    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
