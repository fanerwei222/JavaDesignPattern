package main.designPattern.factory.simple;

/**
 * 
 * 简单工厂类
 * @author fanwei
 *
 */
public class SimpleFactory
{
    private static SimpleOperation operation = null;

    /**
     * 创建对象
     * @param name
     * @return
     */
    public static SimpleOperation createOperation(String name)
    {

        switch (name)
        {
        case "+":
            operation = add();
            break;
        case "-":
            operation = sub();
            break;
        }

        return operation;
    }

    /**
     * 加法方法
     * @return
     */
    private static SimpleOperation add()
    {
        System.out.println("加法运算");
        return new SimpleAdd();
    }

    /**
     * 减法方法
     * @return
     */
    private static SimpleOperation sub()
    {
        System.out.println("减法运算");
        return new SimpleSub();
    }
}
