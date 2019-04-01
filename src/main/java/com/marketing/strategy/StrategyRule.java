/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing.strategy;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/26 13:10
 *
 *
 * 满足策略后执行的规则
 *  默认一个策略有且只有一个一条与之匹配的执行规则
 *  我们应制定不同的策略去返回不通的结果，而不是在用一条策略去
 *  判断后得出多种结果，那样的话会时复杂度倍增。而且失去了构建策略的意思
 *
 *
 */

@Data
public class StrategyRule extends AbstractStrategyRule {

    /**
     * 减免金额
     */
    private BigDecimal derate = BigDecimal.ZERO;


    /**
     * 折扣值
     */
    private BigDecimal discount = BigDecimal.ONE;


}