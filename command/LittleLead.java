package main.designPattern.command;

/**
 * 小领导
 * @author fanwei
 *
 */
public class LittleLead
{
    private Command command;

    public Command getCommand()
    {
        return command;
    }

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void action()
    {
        //小领导执行命令，小领导在叫员工执行
        command.execute();
    }
}
