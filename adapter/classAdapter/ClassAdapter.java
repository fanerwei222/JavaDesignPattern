package main.designPattern.adapter.classAdapter;

/**
 * 适配器、将ps2转换成usb
 * @author fanwei
 *
 */
public class ClassAdapter extends Usber implements Ps2
{

    @Override
    public void isPs2()
    {
        isUsb();
    }

}
