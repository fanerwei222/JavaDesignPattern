package main.designPattern.builder;

/**
 * 建造机器人的方法接口
 * @author fanwei
 *
 */
public interface IBuilderRobot
{
    public void startBuilding();

    public void buildHead();

    public void buildBody();

    public void buildHand();

    public void buildFoot();

    public Robot createRobot();

}
