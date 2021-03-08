package StrategyPattern.Duck.Ducks;

import StrategyPattern.Duck.Behavior.FlyBehavior;
import StrategyPattern.Duck.Behavior.QuackBehavior;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:34
 * Version: 1.0
 * <p>
 * ClassName: Duck
 * Description: 鸭子的抽象类
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;    // 鸭子行为的委托，所有鸭子都继承这两个变量

    public abstract void display(); // 展示鸭子的样式

    public void performFly() {      // 将鸭子的飞行和叫唤行为委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("鸭子都会游泳哦");
    }
}
