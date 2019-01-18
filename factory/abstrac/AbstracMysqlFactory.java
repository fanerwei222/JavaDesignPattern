package main.designPattern.factory.abstrac;

/**
 * mysql工厂
 * @author fanwei
 *
 */
public class AbstracMysqlFactory implements AbstracIFactory
{
    public AbstracMysqlUser mysqlUser = null;
    public AbstracMysqlLogin mysqlLogin = null;

    @Override
    public AbstracIUser createUser()
    {
        this.mysqlUser = new AbstracMysqlUser();
        return this.mysqlUser;
    }

    @Override
    public AbstracILogin createLogin()
    {
        this.mysqlLogin = new AbstracMysqlLogin();
        return this.mysqlLogin;
    }
}
