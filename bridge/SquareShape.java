package main.designPattern.bridge;

/**
 * 正方形
 * @author fanwei
 *
 */
public class SquareShape extends Shape
{

    @Override
    public void draw()
    {
        color.bepaint("正方形");
    }

}
