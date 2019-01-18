package main.designPattern.factory.abstrac;

import java.util.Date;

/**
 * 登录表 实体类
 * @author fanwei
 *
 */
public class AbstracLogin
{
    private String id;
    private Date date;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

}
