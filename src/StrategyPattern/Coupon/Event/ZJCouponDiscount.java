package StrategyPattern.Coupon.Event;

import StrategyPattern.Coupon.ICouponDiscount;

import java.math.BigDecimal;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 14:58
 * Version: 1.0
 * <p>
 * ClassName: ZJCouponDiscount
 * Description: 直减
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     * */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;

        return discountAmount;
    }
}
