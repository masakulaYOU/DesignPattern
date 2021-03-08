package StrategyPattern.Duck.Impl;

import StrategyPattern.Duck.Behavior.QuackBehavior;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:32
 * Version: 1.0
 * <p>
 * ClassName: MuteQuack
 * Description: 鸭子叫唤接口的具体实现，不会叫
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("(不会叫)");
    }
}
