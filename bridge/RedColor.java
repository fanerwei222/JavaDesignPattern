package main.designPattern.bridge;

/**
 * 红色
 * @author fanwei
 *
 */
public class RedColor implements Color
{

    @Override
    public void bepaint(String shape)
    {
        System.out.println("红色的" + shape);
    }

}
