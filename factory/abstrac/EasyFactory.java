package main.designPattern.factory.abstrac;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 用简单工厂来优化抽象工厂
 * @author fanwei
 *
 */
public class EasyFactory
{
    //包名
    private static String packName = "main.designPattern.factory.abstrac";

    // 数据库名称
    private static String db = "Mysql";

    static
    {
        try
        {
            FileReader fileReader = new FileReader("app.json");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuffer config = new StringBuffer();
            String s = null;
            while ((s = bufferedReader.readLine()) != null)
            {
                config.append(s);
            }
            bufferedReader.close();

            /**
             * 本机没有json解析包，注释代码
             */
            //JSONObject jsonObject = new JSONObject(config.toString());

            //packName = jsonObject.getString("packName");
            //db = jsonObject.getString("DB");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // private static String db="Oracle";

    public static AbstracIUser createUser() throws InstantiationException, IllegalAccessException,
            ClassNotFoundException
    {
        String className = packName + ".Abstrac" + db + "User";

        return (AbstracIUser) Class.forName(className).newInstance();
    }

    public static AbstracILogin createLogin() throws InstantiationException, IllegalAccessException,
            ClassNotFoundException
    {
        String className = packName + ".Abstrac" + db + "Login";

        return (AbstracILogin) Class.forName(className).newInstance();
    }
}
