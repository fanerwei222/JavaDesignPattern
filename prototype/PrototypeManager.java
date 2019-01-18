package main.designPattern.prototype;

import java.util.Hashtable;

/**
 * 原型管理器
 * @author fanwei
 *
 */
public class PrototypeManager
{
    /**
     * 单例模式
     */
    private static PrototypeManager pm = new PrototypeManager();

    private Hashtable<String, Object> pManager = new Hashtable<String, Object>();

    public void put(String key, Object value)
    {
        pManager.put(key, value);
    }

    public Object get(String key)
    {
        return pManager.get(key);
    }

    public static PrototypeManager getPrototypeManager()
    {
        return pm;
    }
}
