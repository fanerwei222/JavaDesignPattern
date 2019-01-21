package main.designPattern.composite;

import java.util.ArrayList;

/**
 * 容器构件 
 * @author fanwei
 *
 */
public class Composite extends Component
{

    private String name;
    private String desc;

    private ArrayList<Component> list = new ArrayList<Component>();

    @Override
    public void add(Component c)
    {
        list.add(c);
    }

    @Override
    public void remove(Component c)
    {
        list.remove(c);
    }

    @Override
    public Component getChild(int i)
    {
        return list.get(i);
    }

    @Override
    public void operation()
    {
        /**
         * 容器构件具体业务方法的实现  递归调用成员构件的业务方法
         */
        for (Component component : list)
        {
            component.operation();
        }
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
