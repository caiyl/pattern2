package factorymethod;

/**
 * Created by caiyl on 2016/12/17.
 * ���幤����ɫConcreteGreator2
 */
public class ConcreteGreator2 implements Greator{

    @Override
    public Product factory() {
        return new ConcreteProduct2();
    }
}
