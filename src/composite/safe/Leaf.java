package composite.safe;

/**
 * Created by caiyl on 2016/12/19.
 * 树叶构角色：树叶对象下面没有子对象
 */
public class Leaf implements Component {
    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public void sampleOperation() {

    }
}
