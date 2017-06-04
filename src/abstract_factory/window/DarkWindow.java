package abstract_factory.window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class DarkWindow extends AbstractWindow {

    public DarkWindow() {
        this.description = "Dark AbstractWindow";

    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
