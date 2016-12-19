package prototype;

/**
 * Created by caiyl on 2016/12/19.
 * 客户角色
 */
public class Client {
    private Prototype prototype;

    public void operation(Prototype example){
        Prototype p = (Prototype)example.clone();
    }
}
