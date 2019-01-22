package main.designPattern.command;

/**
 * 客户端
 * @author fanwei
 *
 */
public class CommandClient
{
    public static void main(String[] args)
    {
        //领导发命令，并不用关心你的工作，发命令就可以。具体怎么搞，你们自己搞去
        Command command = new CodeCommand();//命令

        LittleLead lead = new LittleLead(); //小领导

        lead.setCommand(command);

        lead.action();

    }
}
