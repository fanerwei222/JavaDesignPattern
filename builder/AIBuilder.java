package main.designPattern.builder;

/**
 * AI机器人建造
 * @author fanwei
 *
 */
public class AIBuilder implements IBuilderRobot
{

    Robot robot;

    public AIBuilder()
    {
        robot = new Robot();
    }

    @Override
    public void buildHead()
    {
        robot.setHead("智商180的头脑");
    }

    @Override
    public void buildBody()
    {
        robot.setBody("新的身体");
    }

    @Override
    public void buildHand()
    {
        robot.setHand("新的手");
    }

    @Override
    public void buildFoot()
    {
        robot.setFoot("新的脚");
    }

    @Override
    public Robot createRobot()
    {
        return robot;
    }

    @Override
    public void startBuilding()
    {
        System.out.println("start building...");
    }

}
