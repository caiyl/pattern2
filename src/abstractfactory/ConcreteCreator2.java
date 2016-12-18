package abstractfactory;

/**
 * Created by caiyl on 2026/22/28.
 * 具体工厂角色2
 */
public class ConcreteCreator2 implements  Greator{
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
