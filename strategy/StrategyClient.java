package main.designPattern.strategy;

/**
 * 策略模式客户端
 * @author fanwei
 *
 */
public class StrategyClient
{

    public static void main(String[] args)
    {
        /**
         * 1.创建具体测策略实现
         */
        IStrategy iStrategy = new ConcreteStrategy2();

        /**
         * 2.在创建策略上下文的同时，将具体的策略实现对象注入到策略上下文当中
         */
        StrategyContext context = new StrategyContext(iStrategy);

        /**
         * 3.调用上下文对象的方法来完成对具体策略实现的回调
         */
        context.contextMethod();
    }

}
