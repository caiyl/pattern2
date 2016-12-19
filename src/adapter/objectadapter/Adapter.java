package adapter.objectadapter;

import adapter.classadapter.Adaptee;
import adapter.classadapter.Target;

/**
 * Created by caiyl on 2016/12/19.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {

    }

    /**
     * 由于源类没这个方法，因此适配器类要补充上这个方法
     */
    @Override
    public void sampleOperation2() {

    }
}
