/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing.strategy.condition;


import com.marketing.MarketingStrategyParam;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/26 9:23
 */

public interface CondationJudge{

    default boolean eq(MarketingStrategyParam strategyParam) {

        return false;
    }

    default boolean notEq(MarketingStrategyParam strategyParam) {

        return false;
    }

}