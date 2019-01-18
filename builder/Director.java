package main.designPattern.builder;

/**
 * 造人执行器
 * @author fanwei
 *
 */
public class Director
{
    public Robot createRobotByDirector(IBuilderRobot iRobot)
    {
        iRobot.startBuilding();
        iRobot.buildHead();
        iRobot.buildBody();
        iRobot.buildHand();
        iRobot.buildFoot();

        return iRobot.createRobot();
    }
}
