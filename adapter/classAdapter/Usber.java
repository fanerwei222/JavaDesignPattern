package main.designPattern.adapter.classAdapter;

/**
 * usb 接口的实现
 * @author fanwei
 *
 */
public class Usber implements Usb
{

    @Override
    public void isUsb()
    {
        System.out.println("USB口");
    }

}
