package main.designPattern.decorator;

/**
 * 具体实现类，被装饰类
 * @author fanwei
 *
 */
public class ConcreteComponent implements Component
{

    @Override
    public void biu()
    {
        System.out.println("biubiubiu");
    }

}
