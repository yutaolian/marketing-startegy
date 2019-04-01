/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing.strategy;


import com.marketing.MarketingStrategyParam;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/26 9:23
 */

public interface StrategyCondationJudge {

    default boolean judgeOr(MarketingStrategyParam strategyParam) {



        return false;
    }

    default boolean judgeAnd(MarketingStrategyParam strategyParam) {

        return false;
    }

}