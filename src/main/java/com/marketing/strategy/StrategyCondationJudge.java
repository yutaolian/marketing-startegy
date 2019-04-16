/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing.strategy;


import com.marketing.MarketingParam;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/26 9:23
 */

public interface StrategyCondationJudge {

    default boolean judgeOr(MarketingParam strategyParam) {



        return false;
    }

    default boolean judgeAnd(MarketingParam strategyParam) {

        return false;
    }

}