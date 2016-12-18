package singleton;

/**
 * Created by caiyl on 2016/12/18.
 *
 * 懒汉式单例，锁方法，效率低下
 */
public class LazySingleton {

    private static LazySingleton m_instance = null;

    private  LazySingleton(){}

    synchronized public static LazySingleton getInstance(){
        if (m_instance == null) {
            m_instance = new LazySingleton();
        }
        return m_instance;
    }
}
