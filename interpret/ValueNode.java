package main.designPattern.interpret;

/**
 * 非终结表达式
 * 主要用解释该表达式的值
 * @author fanwei
 *
 */
public class ValueNode implements Node
{

    private int value;

    public ValueNode(int value)
    {
        this.value = value;
    }

    @Override
    public int interpret()
    {
        return this.value;
    }

}
