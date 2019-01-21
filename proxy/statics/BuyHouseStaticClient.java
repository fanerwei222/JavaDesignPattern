package main.designPattern.proxy.statics;

/**
 * 买房子客户端
 * @author fanwei
 *
 */
public class BuyHouseStaticClient
{
    public static void main(String[] args)
    {
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy();
        buyHouseProxy.buyHosue();
    }
}
