package StrategyPattern.Duck;

import StrategyPattern.Duck.Ducks.Duck;
import StrategyPattern.Duck.Ducks.MallardDuck;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:42
 * Version: 1.0
 * <p>
 * ClassName: MiniDuckSimulator
 * Description: 测试类
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
    }
}
