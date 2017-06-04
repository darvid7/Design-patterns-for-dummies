package abstract_factory.window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class LightWindow extends Window {

    public LightWindow() {
        this.description = "Light Window";

    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
