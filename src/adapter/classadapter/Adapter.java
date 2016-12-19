package adapter.classadapter;

/**
 * Created by caiyl on 2016/12/19.
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 由于源类没这个方法，因此适配器类要补充上这个方法
     */
    @Override
    public void sampleOperation2() {

    }
}
