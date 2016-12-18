package singleton;

/**
 * Created by caiyl on 2016/12/18.
 *
 * 懒汉式单例，双重锁定，效率高，而且是正确的写法
 */
public class LazySingleton2 {

    private static LazySingleton2 m_instance = null;

    private LazySingleton2(){}

    public static LazySingleton2 getInstance() {
        if (m_instance == null) {
            synchronized (LazySingleton.class) {
                if (m_instance == null) {  //这个判断不能省，否则有可能会产生多一个实例
                    m_instance = new LazySingleton2();
                }
            }
        }
        return m_instance;
    }
}
