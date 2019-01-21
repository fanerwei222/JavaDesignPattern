package main.designPattern.template;

/**
 * 普通汽车
 * @author fanwei
 *
 */
public class NormalCar extends CarModel
{

    @Override
    protected void start()
    {
        System.out.println("普通汽车启动...");
    }

    @Override
    protected void putstab()
    {
        System.out.println("普通汽车挂挡...");
    }

    @Override
    protected void stop()
    {
        System.out.println("普通汽车熄火...");
    }

}
