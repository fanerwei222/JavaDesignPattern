package main.designPattern.builder;

/**
 * main
 * @author fanwei
 *
 */
public class BuilderTest
{
    public static void main(String[] args)
    {
        Director director = new Director();
        Robot human = director.createRobotByDirector(new AIBuilder());

        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHand());
        System.out.println(human.getFoot());

        System.out.println("finish building...");
    }
}
