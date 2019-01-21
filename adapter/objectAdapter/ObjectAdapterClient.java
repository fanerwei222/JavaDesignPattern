package main.designPattern.adapter.objectAdapter;

import main.designPattern.adapter.classAdapter.Ps2;
import main.designPattern.adapter.classAdapter.Usber;

/**
 * 对象适配器客户端
 * @author fanwei
 *
 */
public class ObjectAdapterClient
{

    public static void main(String[] args)
    {
        Ps2 ps2 = new ObjectAdapter(new Usber());
        ps2.isPs2();
    }

}
