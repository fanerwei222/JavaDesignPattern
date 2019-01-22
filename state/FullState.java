package main.designPattern.state;

/**
 * 满水状态或者有水状态
 * @author fanwei
 *
 */
public class FullState implements DispenserState
{

    @Override
    public void press()
    {
        System.out.println("出水了!");
    }

}
