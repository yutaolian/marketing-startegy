package com.marketing.strategy;


import com.marketing.MarketingStrategyParam;

/**
 *
 * 抽象的策略类
 */

@FunctionalInterface
public interface MarketingStrategy {

    /**
     * 执行方法
     * @param strategyParam
     */
    void execute(MarketingStrategyParam strategyParam);

}
