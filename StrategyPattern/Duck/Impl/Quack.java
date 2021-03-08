package StrategyPattern.Duck.Impl;

import StrategyPattern.Duck.Behavior.QuackBehavior;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:30
 * Version: 1.0
 * <p>
 * ClassName: Quack
 * Description: 鸭子叫唤接口的具体实现，鸭子呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }
}
