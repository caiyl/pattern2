package factorymethod;

/**
 * Created by caiyl on 2016/12/17.
 * ���幤����ɫConcreteGreator1
 */
public class ConcreteGreator1 implements Greator{

    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
