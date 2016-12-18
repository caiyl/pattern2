package builder;

/**
 * Created by caiyl on 2016/12/18.
 * 具体建造者角色
 */
public class ConcreteBuiler extends Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        //builder the first part of the product
    }

    @Override
    public void buildPart2() {
    //builder the second part of the product
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
