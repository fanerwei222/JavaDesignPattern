package main.designPattern.observer;

/**
 * 观察者
 * @author fanwei
 *
 */
public class WechatUser implements Observer
{

    private String name;
    private String message;

    public WechatUser(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String message)
    {
        this.message = message;
        read();
    }

    public void read()
    {
        System.out.println(name + " 收到推送消息： " + message);
    }

}
