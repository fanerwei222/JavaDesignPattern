package main.designPattern.visitor;

/**
 * 收入单子
 * @author fanwei
 *
 */
public class IncomeBill implements Bill
{

    @Override
    public void accept(AccountBookViewer viewer)
    {
        viewer.view(this);
    }

    private double amount;

    private String item;

    public IncomeBill(double amount, String item)
    {
        super();
        this.amount = amount;
        this.item = item;
    }

    public double getAmount()
    {
        return amount;
    }

    public String getItem()
    {
        return item;
    }

}
