package main.designPattern.proxy.statics;

/**
 * 买房子代理类
 * @author fanwei
 *
 */
public class BuyHouseProxy implements BuyHouse
{
    private BuyHouse buyHouse;

    public BuyHouseProxy()
    {
        /**
         * 代理模式这里应该是直接new一个BuyHouse的实体类，这里应该是new BuyHouseImpl()；
         * 如果是用动态传入的方式，这里就是属于装饰器模式了。
         */
        //this.buyHouse = buyHouse;
        this.buyHouse = new BuyHouseImpl();
    }

    @Override
    public void buyHosue()
    {
        System.out.println("买房前准备");
        buyHouse.buyHosue();
        System.out.println("买房后装修");
    }

}
