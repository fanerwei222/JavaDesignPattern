package main.designPattern.factory.abstrac;

/**
 * 用户操作类
 * @author fanwei
 *
 */
public interface AbstracIUser
{
    public void insert(AbstracUser user);

    public AbstracIUser getUser(int id);
}
