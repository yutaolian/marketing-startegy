package com.test.strategy;


import lombok.Builder;

import java.math.BigDecimal;

/**
 * 满足策略后执行的规则
 *
 *  默认一个策略有且只有一个一条与之匹配的执行规则
 *
 *  我们应制定不同的策略去返回不通的结果，而不是在用一条策略去
 *  判断后得出多种结果，那样的话会时复杂度倍增。而且失去了构建策略的意思
 *
 *
 */

@Builder(toBuilder=true)
public class StrategyRule {

    /**
     * 作用的地方
     */
    private String target;

    /**
     * 减免金额
     */
    private BigDecimal derate;


    /**
     * 折扣数量
     */
    private float discount;


}
