package main.designPattern.bridge;

/**
 * 客户端
 * @author fanwei
 *
 */
public class BridgeClient
{
    public static void main(String[] args)
    {
        Shape circle = new CircleShape();
        Color color = new RedColor();
        circle.setColor(color);
        circle.draw();
    }
}
