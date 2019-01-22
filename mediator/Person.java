package main.designPattern.mediator;

/**
 * 抽象同事对象
 * @author fanwei
 *
 */
public abstract class Person
{
    protected String name;
    protected Mediator mediator;

    Person(String name, Mediator mediator)
    {
        this.name = name;
        this.mediator = mediator;
    }
}
