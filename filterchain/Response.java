package main.designPattern.filterchain;

/**
 * 封装响应信息的类Response
 * @author fanwei
 *
 */
public class Response
{
    String responseStr;

    public String getResponse()
    {
        return responseStr;
    }

    public void setResponse(String response)
    {
        this.responseStr = response;
    }
}
