package main.designPattern.state;

/**
 * 没水状态
 * @author fanwei
 *
 */
public class NullState implements DispenserState
{

    @Override
    public void press()
    {
        System.out.println("没水了，不出水!");
    }

}
