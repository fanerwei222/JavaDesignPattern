package main.designPattern.factory.abstrac;

/**
 * Oracle工厂
 * @author fanwei
 *
 */
public class AbstracOracleFactory implements AbstracIFactory
{

    @Override
    public AbstracIUser createUser()
    {
        AbstracIUser iUser = new AbstracOracleUser();
        return iUser;
    }

    @Override
    public AbstracILogin createLogin()
    {
        return new AbstracOracleLogin();
    }

}
