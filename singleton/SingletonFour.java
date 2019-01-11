package main.singleton;

/**
 * 第四种（饿汉，变种）（更第三种方式差不多，都是在类初始化即实例化instance）
 * @author fanwei
 *
 */
public class SingletonFour
{
    private static SingletonFour instance = null;
    static
    {
        instance = new SingletonFour();
    }

    private SingletonFour()
    {
    }

    public static SingletonFour getInstance()
    {
        return instance;
    }
}
