package main.designPattern.interpret;

/**
 * 除法解释器（/）
 * @author fanwei
 *
 */
public class DivNode extends SymbolNode
{

    public DivNode(Node left, Node right)
    {
        super(left, right);
    }

    @Override
    public int interpret()
    {
        return super.left.interpret() / super.right.interpret();
    }

}
