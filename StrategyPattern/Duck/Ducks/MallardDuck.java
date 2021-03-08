package StrategyPattern.Duck.Ducks;

import StrategyPattern.Duck.Impl.FlyWithWings;
import StrategyPattern.Duck.Impl.Quack;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:40
 * Version: 1.0
 * <p>
 * ClassName: MallardDuck
 * Description: 绿头鸭一只
 */
public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我是一只绿头鸭");
    }

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
}
