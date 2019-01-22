package main.designPattern.interpret;

/**
 * 取余解释器（%）
 * @author fanwei
 *
 */
public class ModNode extends SymbolNode
{

    public ModNode(Node left, Node right)
    {
        super(left, right);
    }

    @Override
    public int interpret()
    {
        return super.left.interpret() % super.right.interpret();
    }

}
