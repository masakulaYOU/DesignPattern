package StrategyPattern.Coupon.Event;

import StrategyPattern.Coupon.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:52
 * Version: 1.0
 * <p>
 * ClassName: MJCouponDiscount
 * Description: 满减
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {
    /**
     * 满减计算
     * 1. 判断满足x元后-n元，否则不减
     * 2. 最低支付金额1元
     * */
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("n");

        // 小于商品金额条件的，直接返回商品原价
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;
        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;

        return discountAmount;
    }
}
