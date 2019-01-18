package main.designPattern.factory.abstrac;

/**
 * oracle 登录操作
 * @author fanwei
 *
 */
public class AbstracOracleLogin implements AbstracILogin
{

    @Override
    public void insert(AbstracLogin login)
    {
        System.out.println("对 Oracle 里的 Login 表插入了一条数据");
    }

    @Override
    public AbstracLogin getLogin(int id)
    {
        System.out.println("通过 id 在 Oracle 里的 Login 表得到了一条数据");
        return null;
    }

}
