package main.designPattern.composite;

/**
 * 抽象构件类，它既可以代表叶子，又可以代表容器
 * @author fanwei
 *
 */
public abstract class Component
{
    public abstract void add(Component c); //增加成员  

    public abstract void remove(Component c); //删除成员  

    public abstract Component getChild(int i); //获取成员  

    public abstract void operation(); //业务方法 
}
