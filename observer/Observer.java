package main.designPattern.observer;

/**
 * 抽象观察者
 * @author fanwei
 *
 */
public interface Observer
{
    /**
     * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调
     * @param message
     */
    public void update(String message);
}
