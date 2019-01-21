package main.designPattern.bridge;

/**
 * 形状
 * @author fanwei
 *
 */
public abstract class Shape
{
    Color color;

    public void setColor(Color color)
    {
        this.color = color;
    }

    public abstract void draw();
}
