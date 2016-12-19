package prototype;

/**
 * Created by caiyl on 2016/12/19.
 * 具体原型角色
 */
public class ConcretePrototype implements Prototype {
    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
