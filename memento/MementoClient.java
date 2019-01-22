package main.designPattern.memento;

/**
 * 备忘录模式客户端
 * @author fanwei
 *
 */
public class MementoClient
{
    public static void main(String[] args)
    {
        GameRole liaowp = new GameRole();
        liaowp.init();
        liaowp.show();
        RoleStateMange adminMange = new RoleStateMange();
        adminMange.setMemento(liaowp.saveMemento());//保存
        liaowp.fightBoss();
        liaowp.show();
        liaowp.recove(adminMange.getMemento());
        liaowp.show();

    }
}
