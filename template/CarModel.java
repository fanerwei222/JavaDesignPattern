package main.designPattern.template;

/**
 * 汽车模型
 * @author fanwei
 *
 */
public abstract class CarModel
{
    /**
     * 钩子方法、控制挂挡方法是否启用（自动挡就无需挂挡）
     * @return
     */
    protected boolean hook()
    {
        return true;
    }

    /**
     * 汽车启动
     */
    protected abstract void start();

    /**
     * 挂挡
     */
    protected abstract void putstab();

    /**
     * 停车
     */
    protected abstract void stop();

    /**
     * 用户并不需要关注你的车怎么启动或者停下来的，可以开可以停就可以啦
     * 此方法为final方法，因为该顺序
     */
    final public void excet()
    {
        this.start();
        if (this.hook())
        {
            this.putstab();
        }
        this.stop();
    }
}
