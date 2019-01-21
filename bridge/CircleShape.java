package main.designPattern.bridge;

/**
 * 圆
 * @author fanwei
 *
 */
public class CircleShape extends Shape
{

    @Override
    public void draw()
    {
        color.bepaint("圆");
    }

}
