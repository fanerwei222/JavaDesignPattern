package main.designPattern.facade;

/**
 * 内存 （子系统）
 * @author fanwei
 *
 */
public class Memory
{
    public void start()
    {
        System.out.println("内存 启动中...");
    }

    public void shutDown()
    {
        System.out.println("内存 关闭中...");
    }
}
