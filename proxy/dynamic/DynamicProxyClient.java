package main.designPattern.proxy.dynamic;

import java.lang.reflect.Proxy;

import main.designPattern.proxy.statics.BuyHouse;
import main.designPattern.proxy.statics.BuyHouseImpl;

/**
 * 动态代理客户端
 * @author fanwei
 *
 */
public class DynamicProxyClient
{
    public static void main(String[] args)
    {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]
        { BuyHouse.class }, new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHosue();
    }
}
