package main.designPattern.command;

/**
 * 命令
 * @author fanwei
 *
 */
public abstract class Command
{
    protected CodeWorkMan codeWorkMan = new CodeWorkMan();//定义一个程序员

    /**
     * 执行命令
     */
    public abstract void execute();

}
