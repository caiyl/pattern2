package composite.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caiyl on 2016/12/19.
 */
public class Composite implements Component {
    
    private List<Component> childList = new ArrayList<Component>();

    @Override
    public void sampleOperation() {
        List<Component> componentList = components();
        for (Component component : componentList) {
            component.sampleOperation();
        }
    }

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public void add(Component component) {
        childList.add(component);
    }

    @Override
    public void remove(Component component) {
        childList.remove(component);
    }

    @Override
    public List<Component> components() {
        return childList;
    }
}
