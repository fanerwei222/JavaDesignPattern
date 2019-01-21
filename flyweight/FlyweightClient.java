package main.designPattern.flyweight;

import main.designPattern.bridge.Shape;

/**
 * 享元模式客户端
 * @author fanwei
 *
 */
public class FlyweightClient
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException
    {
        Shape redSquare = FlyweightFactory.getShape("square", "red");
        redSquare.draw();
        Shape redSquare2 = FlyweightFactory.getShape("square", "red");
        redSquare2.draw();

        Shape redCircle = FlyweightFactory.getShape("circle", "red");
        redCircle.draw();

    }
}
