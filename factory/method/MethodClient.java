package main.designPattern.factory.method;

/**
 * 方法工厂客户端
 * @author fanwei
 *
 */
public class MethodClient
{
    public static void main(String[] args) throws Exception
    {
        MethodFactory addFactory = (MethodFactory) Class.forName("main.designPattern.factory.method.MethodAddFactory")
                .newInstance();
        MethodFactory subFactory = (MethodFactory) Class.forName("main.designPattern.factory.method.MethodSubFactory")
                .newInstance();

        MethodOperation addOperation = addFactory.createOperation();
        MethodOperation subOperation = subFactory.createOperation();

        System.out.println(addOperation.getResult(3, 2));
        System.out.println(subOperation.getResult(5, 65));

    }
}
