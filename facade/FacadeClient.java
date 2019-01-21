package main.designPattern.facade;

/**
 * 门面模式客户端
 * @author fanwei
 *
 */
public class FacadeClient
{
    public static void main(String[] args) throws InterruptedException
    {
        FacadeComputer computer = new FacadeComputer();
        computer.start();
        Thread.sleep(3000);
        System.out.println("=====================================");
        computer.shutDown();
    }
}
