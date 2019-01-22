package main.designPattern.command;

/**
 * 程序员执行命令
 * @author fanwei
 *
 */
public class CodeCommand extends Command
{

    @Override
    public void execute()
    {
        super.codeWorkMan.work();//工作

        super.codeWorkMan.overWork();//加班

        super.codeWorkMan.writeDocument();//写文档

    }

}
