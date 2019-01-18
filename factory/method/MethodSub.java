package main.designPattern.factory.method;

/**
 * 减法运算类
 * @author fanwei
 *
 */
public class MethodSub implements MethodOperation
{

    @Override
    public double getResult(double num1, double num2) throws Exception
    {
        // TODO Auto-generated method stub
        return num1 - num2;
    }

}
