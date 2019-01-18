package main.designPattern.factory.method;

/**
 * 加法工厂
 * @author fanwei
 *
 */
public class MethodAddFactory implements MethodFactory
{

    @Override
    public MethodOperation createOperation()
    {
        System.out.println("加法运算");
        return new MethodAdd();
    }

}
