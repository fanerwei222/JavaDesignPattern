package main.designPattern.interpret;

/**
 * 抽象表达式
 * @author fanwei
 *
 */
public interface Node
{
    /**
     * 计算值
     * @return
     */
    public int interpret();
}
