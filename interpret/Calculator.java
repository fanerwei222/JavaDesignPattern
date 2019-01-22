package main.designPattern.interpret;

import java.util.Stack;

/**
 * 计算处理类
 * @author fanwei
 *
 */
public class Calculator
{
    @SuppressWarnings("unused")
    private String statement;

    private Node node;

    public void build(String statement)
    {
        Node left = null;
        Node right = null;

        /**
         * 定义一个栈用来存储Node节点
         */
        Stack<Node> stack = new Stack<Node>();

        /**
         * 对传入的字符串进行转换，转换成字符串数组
         */
        String[] statementArr = statement.split(" ");

        for (int i = 0; i < statementArr.length; i++)
        {
            if (statementArr[i].equalsIgnoreCase("*"))
            {
                /**
                 * 如果该字符是 * ，抛出左节点，并且把右节点赋值给Node right;
                 * 之后将left 和 right 放入乘法解释器计算并且将返回的Node 放进栈；
                 */
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new MulNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/"))
            {
                /**
                 * 如果该字符是 / ，抛出左节点，并且把右节点赋值给Node right;
                 * 之后将left 和 right 放入除法解释器计算并且将返回的Node 放进栈；
                 */
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new DivNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("%"))
            {
                /**
                 * 如果该字符是 % ，抛出左节点，并且把右节点赋值给Node right;
                 * 之后将left 和 right 放入求余解释器计算并且将返回的Node 放进栈；
                 */
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new ModNode(left, right));
            } else
            {
                /**
                 * 如果该字符是数字 ，直接放进栈；
                 */
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        /**
         * 把最后的计算结果抛出放进node
         */
        this.node = (Node) stack.pop();

    }

    /**
     * 得到node的值
     * @return
     */
    public int compute()
    {
        return node.interpret();
    }
}
