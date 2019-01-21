package main.designPattern.composite;

/**
 * 叶子构件
 * @author fanwei
 *
 */
public class Leaf extends Component
{
    private String name;
    private String desc;

    @Override
    public void add(Component c)
    {
        //异常处理或错误提示
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component c)
    {
        //异常处理或错误提示
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int i)
    {
        //异常处理或错误提示
        throw new UnsupportedOperationException();
    }

    @Override
    public void operation()
    {
        // TODO Auto-generated method stub
        //叶子构件具体业务方法的实现  
        System.out.println("名称： " + this.name + "  描述：" + this.desc);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

}
