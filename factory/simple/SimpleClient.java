package main.designPattern.factory.simple;

/**
 * 简单工厂客户端
 * @author fanwei
 *
 */
public class SimpleClient
{
    public static void main(String[] args) throws Exception
    {
        SimpleOperation add = SimpleFactory.createOperation("+");
        SimpleOperation sub = SimpleFactory.createOperation("-");

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
    }
}
