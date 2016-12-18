package builder;

/**
 * Created by caiyl on 2016/12/18.
 * 导演者角色
 */
public class Director {

    private Builder builder;

    public void construct(){
        builder = new ConcreteBuiler();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
        //continue with other code
    }

}
