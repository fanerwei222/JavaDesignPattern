package main.designPattern.facade;

/**
 * 计算机 --门面类（核心）
 * @author fanwei
 *
 */
public class FacadeComputer
{
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public FacadeComputer()
    {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void start() throws InterruptedException
    {
        System.out.println("电脑正在启动....");
        cpu.start();
        Thread.sleep(1000);
        disk.start();
        Thread.sleep(1000);
        memory.start();
        Thread.sleep(500);
        System.out.println("电脑启动完毕....");
    }

    public void shutDown() throws InterruptedException
    {
        System.out.println("电脑正在关机....");
        cpu.shutDown();
        Thread.sleep(1000);
        disk.shutDown();
        Thread.sleep(1000);
        memory.shutDown();
        Thread.sleep(500);
        System.out.println("电脑关机成功!");
    }

}
