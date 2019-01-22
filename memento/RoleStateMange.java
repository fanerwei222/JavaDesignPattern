package main.designPattern.memento;

/**
 * 游戏角色管理类
 * @author fanwei
 *
 */
public class RoleStateMange
{
    private RoleStateMemento memento;

    public RoleStateMemento getMemento()
    {
        return memento;
    }

    public void setMemento(RoleStateMemento memento)
    {
        this.memento = memento;
    }
}
