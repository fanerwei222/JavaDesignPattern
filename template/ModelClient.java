package main.designPattern.template;

/**
 * 模板方法模式客户端
 * @author fanwei
 *
 */
public class ModelClient
{
    public static void main(String[] args)
    {
        CarModel autoCar = new AutoCar();
        autoCar.excet();
        System.out.println("==============================");
        CarModel normalCar = new NormalCar();
        normalCar.excet();
        System.out.println("==============================");
        AutoCar autoCarWithStub = new AutoCar();
        /**
         * 有一款可以挂挡的自动车
         */
        autoCarWithStub.setHasStub(true);
        autoCarWithStub.excet();
    }
}
