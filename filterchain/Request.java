package main.designPattern.filterchain;

/**
 * 封装请求的类Request
 * @author fanwei
 *
 */
public class Request
{
    String requestStr;

    public String getRequest()
    {
        return requestStr;
    }

    public void setRequest(String request)
    {
        this.requestStr = request;
    }
}
