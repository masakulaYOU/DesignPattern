package StrategyPattern.Coupon.Event;

import StrategyPattern.Coupon.ICouponDiscount;

import java.math.BigDecimal;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 15:07
 * Version: 1.0
 * <p>
 * ClassName: NYGCouponDiscount
 * Description: N元购
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {
    /**
     * n元购买
     * 1. 无论原价多少都按固定金额购买
     * */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
