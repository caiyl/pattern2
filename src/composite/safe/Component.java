package composite.safe;

/**
 * Created by caiyl on 2016/12/19.
 * 抽象构件角色：它给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象。
 * 合成对象通常把它所包含的子对象当做类型为component的对象。
 * 在安全式的合成模式里，构件角色并不定义出管理子对象的方法，这一定义由树枝构件对象给出。
 */
public interface Component {

    /**
     * 返回自己的实例
     * @return
     */
    Component getComponent();

    /**
     * 某个商业方法
     */
    void sampleOperation();
}
