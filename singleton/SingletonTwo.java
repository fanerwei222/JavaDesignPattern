package main.singleton;

/**
 * 第二种（懒汉，线程安全）（在需要的时候创建实例）
 * @author fanwei
 *
 */
public class SingletonTwo
{
    private static SingletonTwo instance;

    private SingletonTwo()
    {
    }

    public static synchronized SingletonTwo getInstance()
    {
        if (instance == null)
        {
            instance = new SingletonTwo();
        }

        return instance;
    }
}
