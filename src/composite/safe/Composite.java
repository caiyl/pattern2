package composite.safe;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by caiyl on 2016/12/19.
 *
 * 树枝构件角色：代表参加组合的有下级子对象的对象。
 * 树枝对象给出所有的管理子对象的方法，如add，remove，已经components()的声明
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<Component>();

    @Override
    public Composite getComponent() {
        return this;
    }

    @Override
    public void sampleOperation() {
        List<Component> list = components();
        for (Component component : list) {
            component.sampleOperation();
        }
    }

    public void add(Component component){
        componentList.add(component);
    }

    public void remove(Component component){
        componentList.remove(component);
    }

    public List<Component> components(){
        return componentList;
    }
}
