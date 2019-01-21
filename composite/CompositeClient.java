package main.designPattern.composite;

/**
 * 客户端
 * @author fanwei
 *
 */
public class CompositeClient
{
    public static void main(String[] args)
    {
        Component con1 = new Composite();
        Leaf leaf1 = new Leaf();
        leaf1.setName("叶子1");
        leaf1.setDesc("叶子1的描述信息");
        Leaf leaf2 = new Leaf();
        leaf2.setName("叶子2");
        leaf2.setDesc("叶子2的描述信息");
        Leaf leaf3 = new Leaf();
        leaf3.setName("叶子3");
        leaf3.setDesc("叶子3的描述信息");

        con1.add(leaf1);
        con1.add(leaf2);
        con1.add(leaf3);
        con1.operation();

    }
}
