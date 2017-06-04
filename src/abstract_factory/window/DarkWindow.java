package abstract_factory.window;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public class DarkWindow extends Window {

    public DarkWindow() {
        this.description = "Dark Window";

    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
