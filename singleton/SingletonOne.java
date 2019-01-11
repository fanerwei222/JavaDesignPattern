package main.singleton;

/**
 * 第一种（懒汉，线程不安全）（在需要的时候创建实例）
 * @author fanwei
 *
 */
public class SingletonOne
{
    private static SingletonOne instance;

    private SingletonOne()
    {
    }

    public static SingletonOne getInstance()
    {
        if (instance == null)
        {
            instance = new SingletonOne();
        }

        return instance;
    }
}
