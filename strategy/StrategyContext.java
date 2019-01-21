package main.designPattern.strategy;

/**
 * 策略上下文
 * @author fanwei
 *
 */
public class StrategyContext
{
    /**
     * 持有一个策略实现的引用
     */
    private IStrategy iStrategy;

    /**
     * 使用构造器注入具体的策略类
     */
    public StrategyContext(IStrategy iStrategy)
    {
        this.iStrategy = iStrategy;
    }

    public void contextMethod()
    {
        /**
         * 调用策略实现的方法
         */
        iStrategy.algorithmMethod();
    }
}
