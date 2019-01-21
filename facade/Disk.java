package main.designPattern.facade;

/**
 * 磁盘（子系统）
 * @author fanwei
 *
 */
public class Disk
{
    public void start()
    {
        System.out.println("磁盘 启动中...");
    }

    public void shutDown()
    {
        System.out.println("磁盘 关闭中...");
    }
}
