package abstract_factory.window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class LightWindow extends AbstractWindow {

    public LightWindow() {
        this.description = "Light AbstractWindow";

    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
