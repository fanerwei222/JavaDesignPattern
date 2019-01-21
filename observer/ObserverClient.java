package main.designPattern.observer;

/**
 * 观察者模式客户端
 * @author fanwei
 *
 */
public class ObserverClient
{
    public static void main(String[] args)
    {
        WechatServer server = new WechatServer();

        Observer userZhang = new WechatUser("ZhangSan");
        Observer userLi = new WechatUser("LiSi");
        Observer userWang = new WechatUser("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
    }
}
