package observer.listener.observerAsListenerInterface;

import java.util.ArrayList;

/**
 * @author David Lei (david.anthony.lei@gmail.com)
 * @since 4/06/2017
 */

public interface OnChangeObserverCallback {
    void doSomethingWithNewData(ArrayList<String> data);
}
