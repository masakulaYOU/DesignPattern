package StrategyPattern.Coupon;

import java.math.BigDecimal;

/**
 * 折扣卷的折扣行为接口
 * */
public interface ICouponDiscount<T> {
    /**
     * 优惠卷金额计算
     * @param couponInfo    券折扣信息：直减、满减、折扣、N元购
     * @param skuPrice      sku金额
     * @return              优惠后金额
     * */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
