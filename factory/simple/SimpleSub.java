package main.designPattern.factory.simple;

/**
 * 减法类
 * @author fanwei
 *
 */
public class SimpleSub implements SimpleOperation
{

    @Override
    public double getResult(double num1, double num2) throws Exception
    {
        // TODO Auto-generated method stub
        return num1 - num2;
    }

}
