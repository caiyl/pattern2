package builder;

/**
 * Created by caiyl on 2016/12/18.
 * 抽象建造者角色
 */
abstract public class Builder {
    /**
     * 产品零件建筑方法
     */
    public abstract void buildPart1();
    /**
     * 产品零件建筑方法
     */
    public abstract void buildPart2();

    /**
     * 产品返还方法
     */
    public abstract Product retrieveResult();
}
