package main.designPattern.adapter.interfaceAdapter;

/**
 * 客户端
 * @author fanwei
 *
 */
public class InterClient
{
    public static void main(String[] args)
    {
        SomeInter inter = new InterAction();
        inter.a();
        inter.b();
    }
}
