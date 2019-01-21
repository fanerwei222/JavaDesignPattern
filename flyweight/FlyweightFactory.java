package main.designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

import main.designPattern.bridge.Color;
import main.designPattern.bridge.Shape;

/**
 * 享元工厂
 * @author fanwei
 *
 */
public class FlyweightFactory
{

    //颜色包名
    private static String colorPackName = "main.designPattern.bridge";
    //形状包名
    private static String shapePackName = "main.designPattern.bridge";

    /**
     * 已经存在的形状
     */
    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String shapeName, String color) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException
    {
        String colorStr = new String(color);
        String shapeNameStr = new String(shapeName);
        colorStr = upperCase(colorStr);
        shapeNameStr = upperCase(shapeNameStr);
        //颜色类名
        String colorClassName = colorPackName + "." + colorStr + "Color";
        //形状类名
        String shapeClassName = shapePackName + "." + shapeNameStr + "Shape";

        Shape shape = shapes.get(color + shapeName);
        /**
         * 如果shape==null,表示不存在,则新建,并且保持到共享池中
         */
        if (shape == null)
        {
            Color colorNew = (Color) Class.forName(colorClassName).newInstance();
            shape = (Shape) Class.forName(shapeClassName).newInstance();
            shape.setColor(colorNew);
            shapes.put(color + shapeName, shape);
        }
        return shape;
    }

    public static int getSum()
    {
        return shapes.size();
    }

    /**
     * 首字母大写
     * @param str
     * @return
     */
    private static String upperCase(String str)
    {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
