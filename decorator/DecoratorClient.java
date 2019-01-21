package main.designPattern.decorator;

/**
 * 客户端
 * @author fanwei
 *
 */
public class DecoratorClient
{
    public static void main(String[] args)
    {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator(component);
        decorator.biu();
    }
}
