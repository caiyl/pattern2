package factorymethod;

/**
 * Created by caiyl on 2016/12/17.
 * 具体工厂角色ConcreteGreator2
 */
public class ConcreteGreator2 implements Greator{

    @Override
    public Product factory() {
        return new ConcreteProduct2();
    }
}
