package composite.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caiyl on 2016/12/19.
 */
public class Leaf implements Component {
    

    @Override
    public void sampleOperation() {
    }

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public List<Component> components() {
        return null;
    }

}
