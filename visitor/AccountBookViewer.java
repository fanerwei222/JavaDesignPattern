package main.designPattern.visitor;

/**
 * 账单查看者接口（相当于Visitor）
 * @author fanwei
 *
 */
public interface AccountBookViewer
{
    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
    void view(IncomeBill bill);
}
