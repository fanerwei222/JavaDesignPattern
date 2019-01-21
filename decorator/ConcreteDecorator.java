package main.designPattern.decorator;

/**
 * 具体装饰类
 * @author fanwei
 *
 */
public class ConcreteDecorator extends Decorator
{

    public ConcreteDecorator(Component component)
    {
        super(component);
    }

    public void biu()
    {
        System.out.println("ready?go!");
        component.biu();
    }

}
