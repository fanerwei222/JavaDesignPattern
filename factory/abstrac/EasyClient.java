package main.designPattern.factory.abstrac;

/**
 * 简单工厂客户端
 * @author fanwei
 *
 */
public class EasyClient
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException
    {
        AbstracUser user = new AbstracUser();
        AbstracLogin login = new AbstracLogin();

        AbstracIUser userOperation = EasyFactory.createUser();

        userOperation.insert(user);
        userOperation.getUser(1);

        AbstracILogin loginOperation = EasyFactory.createLogin();

        loginOperation.insert(login);
        loginOperation.getLogin(1);
    }
}
