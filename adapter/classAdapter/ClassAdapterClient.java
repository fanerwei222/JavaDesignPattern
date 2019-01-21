package main.designPattern.adapter.classAdapter;

/**
 * 测试类
 * @author fanwei
 *
 */
public class ClassAdapterClient
{
    public static void main(String[] args)
    {
        Ps2 ps2 = new ClassAdapter();
        ps2.isPs2();

    }
}
