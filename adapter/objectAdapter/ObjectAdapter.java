package main.designPattern.adapter.objectAdapter;

import main.designPattern.adapter.classAdapter.Ps2;
import main.designPattern.adapter.classAdapter.Usber;

/**
 * 对象适配器
 * @author fanwei
 *
 */
public class ObjectAdapter implements Ps2
{
    private Usber usber;

    public ObjectAdapter(Usber usber)
    {
        this.usber = usber;
    }

    @Override
    public void isPs2()
    {
        usber.isUsb();
    }

}
