package main.designPattern.state;

/**
 * 状态模式客户端
 * @author fanwei
 *
 */
public class StateClient
{
    public static void main(String[] args)
    {
        /**
         * 初始化一个满水的饮水机
         */
        WaterDispenser dispenser = new WaterDispenser(new FullState());

        /**
         * 循环按压30次哦
         */
        for (int i = 0; i < 30; ++i)
        {
            dispenser.press();
        }
    }
}
