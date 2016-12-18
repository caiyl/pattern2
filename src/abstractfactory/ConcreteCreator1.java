package abstractfactory;

/**
 * Created by caiyl on 2016/12/18.
 * 具体工厂角色1
 */
public class ConcreteCreator1 implements  Greator{
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
