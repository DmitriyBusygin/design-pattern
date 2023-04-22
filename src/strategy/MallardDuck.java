package strategy;

import strategy.interfaces.fly.FlyWithWings;
import strategy.interfaces.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
