package main.designPattern.interpret;

/**
 * 乘法解释器（*）
 * @author fanwei
 *
 */
public class MulNode extends SymbolNode
{

    public MulNode(Node left, Node right)
    {
        super(left, right);
    }

    @Override
    public int interpret()
    {
        return left.interpret() * right.interpret();
    }

}
