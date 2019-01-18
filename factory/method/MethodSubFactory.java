package main.designPattern.factory.method;

/**
 * 减法工厂
 * @author fanwei
 *
 */
public class MethodSubFactory implements MethodFactory
{

    @Override
    public MethodOperation createOperation()
    {
        System.out.println("减法运算");
        return new MethodSub();
    }

}
