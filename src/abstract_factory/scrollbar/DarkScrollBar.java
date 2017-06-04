package abstract_factory.scrollbar;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class DarkScrollBar extends ScrollBar{

    public DarkScrollBar() {
        this.description = "Dark scrollbar";

    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
