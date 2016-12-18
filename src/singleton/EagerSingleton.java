package singleton;

/**
 * Created by caiyl on 2016/12/18.
 * 饿汉式单例类
 */
public class EagerSingleton {
    private static final EagerSingleton m_instance = new EagerSingleton();


    private  EagerSingleton(){}

    public  static  EagerSingleton getInstance(){
        return m_instance;
    }
}
