package factorymethod;

/**
 * Created by caiyl on 2016/12/17.
 *抽象工厂(Creator)角色：担任这个角色的是工厂方法模式的核心，它是与应用程序无关的。
 * 任何在模式中创建对象的工厂类必须实现这个接口。在上面的系统中，这个角色有java接口Creator扮演；
 * 在实际系统中，这个角色也常常由抽象实现。
 */
public interface Greator {
    Product factory();
}
