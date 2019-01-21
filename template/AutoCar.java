package main.designPattern.template;

/**
 * 自动挡车
 * @author fanwei
 *
 */
public class AutoCar extends CarModel
{

    /**
     * 自动挡车无需挂挡
     */
    private boolean hasStub = false;

    @Override
    protected boolean hook()
    {
        return this.hasStub;
    }

    @Override
    protected void start()
    {
        System.out.println("自动挡汽车启动...");
    }

    @Override
    protected void putstab()
    {
        System.out.println("自动挡汽车挂挡...");
    }

    @Override
    protected void stop()
    {
        System.out.println("自动挡汽车熄火...");
    }

    public boolean isHasStub()
    {
        return hasStub;
    }

    public void setHasStub(boolean hasStub)
    {
        this.hasStub = hasStub;
    }

}
