package abstractfactory;

/**
 * Created by caiyl on 2016/12/18.
 * 抽象工厂角色
 */
public interface Greator {
    ProductA factoryA();
    ProductB factoryB();
}
