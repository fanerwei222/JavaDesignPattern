package main.designPattern.factory.abstrac;

/**
 * 客户端
 * @author fanwei
 *
 */
public class AbstracClient
{
    public static void main(String[] args)
    {
        AbstracUser user = null;
        AbstracIUser iUser = null;

        AbstracIFactory mysqlFactory = new AbstracMysqlFactory();
        iUser = mysqlFactory.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        AbstracIFactory oracleFactory = new AbstracOracleFactory();
        iUser = oracleFactory.createUser();
        iUser.insert(user);
        iUser.getUser(2);
    }
}
