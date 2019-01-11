package main.singleton;

/**
 * 第七种（双重校验锁）
 * @author fanwei
 *
 */
public class SingletonSeven
{
    private volatile static SingletonSeven singleton;

    private SingletonSeven()
    {
    }

    public static SingletonSeven getSingleton()
    {
        if (singleton == null)
        {
            synchronized (SingletonSeven.class)
            {
                if (singleton == null)
                {
                    singleton = new SingletonSeven();
                }
            }
        }
        return singleton;
    }
}
