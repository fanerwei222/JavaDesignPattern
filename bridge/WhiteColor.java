package main.designPattern.bridge;

/**
 * 白色
 * @author fanwei
 *
 */
public class WhiteColor implements Color
{

    @Override
    public void bepaint(String shape)
    {
        System.out.println("白色的" + shape);
    }

}
