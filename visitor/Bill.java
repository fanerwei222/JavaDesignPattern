package main.designPattern.visitor;

/**
 * 单个单子的接口（相当于Element）
 * @author fanwei
 *
 */
public interface Bill
{
    void accept(AccountBookViewer viewer);
}
