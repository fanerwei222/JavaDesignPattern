package main.designPattern.command;

/**
 * 工作人员
 * @author fanwei
 *
 */
public abstract class WorkMan
{
    /**
     * 写文档
     */
    public abstract void writeDocument();

    /**
     * 工作
     */
    public abstract void work();

    /**
     * 加班
     */
    public abstract void overWork();

}