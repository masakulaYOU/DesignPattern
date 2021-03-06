package StrategyPattern.Duck.Impl;

import StrategyPattern.Duck.Behavior.FlyBehavior;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:29
 * Version: 1.0
 * <p>
 * ClassName: FlyNoWay
 * Description: 鸭子飞行接口的具体实现类，不能飞行
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞啊");
    }
}
