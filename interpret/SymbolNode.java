package main.designPattern.interpret;

/**
 * 终结表达式抽象类
 * 由于该终结表达式需要解释多个运算符号，同时用来构建抽象语法树
 * @author fanwei
 *
 */
public abstract class SymbolNode implements Node
{
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right)
    {
        this.left = left;
        this.right = right;
    }

}
