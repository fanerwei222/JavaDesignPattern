package main.designPattern.factory.abstrac;

/**
 * IFactory接口
 * @author fanwei
 *
 */
public interface AbstracIFactory
{
    public AbstracIUser createUser();

    public AbstracILogin createLogin();
}
