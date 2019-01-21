package main.designPattern.decorator;

/**
 * 装饰类
 * @author fanwei
 *
 */
public class Decorator implements Component
{

    Component component;

    public Decorator(Component component)
    {
        this.component = component;
    }

    @Override
    public void biu()
    {
        component.biu();
    }

}
