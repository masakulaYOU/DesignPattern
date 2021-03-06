package StrategyPattern.Duck.Impl;

import StrategyPattern.Duck.Behavior.FlyBehavior;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:28
 * Version: 1.0
 * <p>
 * ClassName: FlyWithWings
 * Description: 鸭子飞的具体实现类，使用翅膀飞行
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用翅膀飞行");
    }
}
