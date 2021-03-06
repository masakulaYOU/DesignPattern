package StrategyPattern.Coupon;

import javax.swing.*;
import java.math.BigDecimal;

/**
 * Author: Cheers Lee
 * Date: 2021/3/6 15:09
 * Version: 1.0
 * <p>
 * ClassName: Context
 * Description: 控制策略类，就是商品吧，用行为类委托代理优惠
 */
public class Context<T> {
    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    // 使用couponDiscount委托行为
    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
