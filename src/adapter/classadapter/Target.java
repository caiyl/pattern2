package adapter.classadapter;

/**
 * Created by caiyl on 2016/12/19.
 * 目标角色：这就是所期待的接口
 */
public interface Target {
    /**
     * 这是源类有的方法
     */
    void sampleOperation1();

    /**
     * 这是源类没有的方法
     */
    void sampleOperation2();
}
