package main.designPattern.state;

/**
 * 饮水机
 * @author fanwei
 *
 */
public class WaterDispenser
{
    private static int capacity = 20;
    private static DispenserState dispenserState;

    public WaterDispenser(DispenserState state)
    {
        dispenserState = state;
    }

    private static void setState(DispenserState state)
    {
        dispenserState = state;
    }

    public DispenserState getState()
    {
        return dispenserState;
    }

    /**
     * 按压出水口操作
     */
    public void press()
    {
        capacity--;
        if (capacity <= 0)
        {
            setState(new NullState());
        }
        dispenserState.press();
    }
}
