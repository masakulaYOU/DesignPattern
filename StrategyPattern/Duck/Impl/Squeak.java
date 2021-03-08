package StrategyPattern.Duck.Impl;

import StrategyPattern.Duck.Behavior.QuackBehavior;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:31
 * Version: 1.0
 * <p>
 * ClassName: Squeak
 * Description: 鸭子叫唤接口的具体实现类，橡皮鸭子的吱吱叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱吱");
    }
}
