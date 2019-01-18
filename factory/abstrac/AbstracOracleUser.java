package main.designPattern.factory.abstrac;

/**
 * Oracle 用户操作类
 * @author fanwei
 *
 */
public class AbstracOracleUser implements AbstracIUser
{

    @Override
    public void insert(AbstracUser user)
    {
        System.out.println("对 Oracle 里的 User 表插入了一条数据");
    }

    @Override
    public AbstracIUser getUser(int id)
    {
        System.out.println("通过 id 在 Oracle 里的 User 表得到了一条数据");
        return null;
    }

}
