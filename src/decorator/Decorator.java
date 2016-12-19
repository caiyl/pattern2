package decorator;

/**
 * Created by caiyl on 2016/12/19.
 *
 * 装饰角色：持有一个构件对象的实例，并定义一个与抽象构件一致的接口。
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
    }

    /**
     * 商业方法委派给构件
     */
    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
