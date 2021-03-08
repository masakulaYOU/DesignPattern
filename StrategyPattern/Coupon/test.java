package StrategyPattern.Coupon;

import StrategyPattern.Coupon.Event.MJCouponDiscount;
import StrategyPattern.Coupon.Event.NYGCouponDiscount;
import StrategyPattern.Coupon.Event.ZJCouponDiscount;
import StrategyPattern.Coupon.Event.ZKCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 15:12
 * Version: 1.0
 * <p>
 * ClassName: test
 * Description: 测试类
 */
public class test {
    public static void main(String[] args) {
        // 直减 100-10
        Context<Double> context = new Context<>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        System.out.println("测试结果：直减优惠后金额：" + discountAmount);

        // 满减，满100-10
        Context<Map<String, String>> context2 = new Context<>(new MJCouponDiscount());
        Map<String, String> mapReg = new HashMap<>();
        mapReg.put("x", "100");
        mapReg.put("n", "10");
        BigDecimal discountAmount2 = context2.discountAmount(mapReg, new BigDecimal(100));
        BigDecimal discountAmount3 = context2.discountAmount(mapReg, new BigDecimal(50));
        System.out.println("测试结果：100满减10，100元满减后结果：" + discountAmount2);
        System.out.println("测试结果：100满减10，50元满减后结果：" + discountAmount3);

        // 折扣9折
        Context<Double> context3 = new Context<>(new ZKCouponDiscount());
        BigDecimal discountAmount4 = context3.discountAmount(0.9D, new BigDecimal(100));
        System.out.println("测试结果：9折后结果：" + discountAmount4);

        // n元购 85块钱
        Context<Double> context4 = new Context<>(new NYGCouponDiscount());
        BigDecimal discountAmount5 = context4.discountAmount(85D, new BigDecimal(100));
        System.out.println("测试结果：n元购结果：" + discountAmount5);

    }
}
