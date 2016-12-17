package simplefactory;

/**
 * Created by caiyl on 2016/12/17.
 * 描述：简单工厂模式设计到工厂角色，抽象产品角色以及具体产品角色
 *
 * 角色：
 * 工厂类（Greatro)角色：担任这个角色的是工厂方法模式的核心，含有与应用紧密的相关的商业逻辑。
 * 工厂类在客户端的直接调用下创建产品对象，它往往有一个具体的java类实现。
 *
 * 例子：jdk里面的DateFormat
 */
public class Greator {
    public static Product factory(){
        return new ConcreteProduct();
    }
}
