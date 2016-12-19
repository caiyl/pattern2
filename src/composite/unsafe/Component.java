package composite.unsafe;

import java.util.List;

/**
 * Created by caiyl on 2016/12/19.
 * 抽象构件角色
 */
public interface Component {
    void sampleOperation();
    Component getComponent();
    void add(Component component);
    void remove(Component component);
    List<Component> components();
}
