package main.designPattern.adapter.interfaceAdapter;

/**
 * 实际需要使用到被转换方法的类
 * @author fanwei
 *
 */
public class InterAction extends InterAdapter
{

    @Override
    public void a()
    {
        System.out.println("实现A方法被调用");
    }

    @Override
    public void b()
    {
        System.out.println("实现B方法被调用");
    }

}
