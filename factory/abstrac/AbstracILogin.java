package main.designPattern.factory.abstrac;

/**
 * 登录操作接口
 * @author fanwei
 *
 */
public interface AbstracILogin
{
    public void insert(AbstracLogin login);

    public AbstracLogin getLogin(int id);
}
