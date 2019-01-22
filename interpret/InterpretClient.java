package main.designPattern.interpret;

/**
 * 解释器模式客户端
 * @author fanwei
 *
 */
public class InterpretClient
{
    public static void main(String args[])
    {
        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
