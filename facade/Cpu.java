package main.designPattern.facade;

/**
 * CPU（子系统）
 * @author fanwei
 *
 */
public class Cpu
{
    public void start()
    {
        System.out.println("CPU 启动中...");
    }

    public void shutDown()
    {
        System.out.println("CPU 关闭中...");
    }
}
