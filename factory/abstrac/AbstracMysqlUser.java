package main.designPattern.factory.abstrac;

/**
 * mysql 用户操作类
 * @author fanwei
 *
 */
public class AbstracMysqlUser implements AbstracIUser
{

    @Override
    public void insert(AbstracUser user)
    {
        System.out.println("对 MySQL 里的 User 表插入了一条数据");
    }

    @Override
    public AbstracIUser getUser(int id)
    {
        System.out.println("通过 id 在 MySQL 里的 User 表得到了一条数据");
        return null;
    }

}
