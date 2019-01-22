package main.designPattern.command;

/**
 * 程序员
 * @author fanwei
 *
 */
public class CodeWorkMan extends WorkMan
{

    @Override
    public void writeDocument()
    {
        System.out.println("写文档中......");
    }

    @Override
    public void work()
    {
        System.out.println("上班中.....");
    }

    @Override
    public void overWork()
    {
        System.out.println("加班中......");
    }

}
