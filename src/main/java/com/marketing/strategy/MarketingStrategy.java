package com.marketing.strategy;


import com.marketing.MarketingParam;

/**
 * 抽象的策略类
 */

public interface MarketingStrategy {

    /**
     * 公共的条件逻辑判断
     * <p>
     * 这里建议使用jdk8 stream 来处理 function接口
     * 中的谓词 Predicate 他的默认方法实现了与或非的
     *
     * @param strategyParam
     * @return
     */
    default boolean judge(MarketingParam strategyParam) {
        //这个条件是策略的条件
        StrategyContent strategyContent = strategyParam.getStrategyContent();
        //具体的条件对象
        StrategyCondation strategyCondation = strategyContent.getCondation();

        boolean or = strategyCondation.judgeOr(strategyParam);

        boolean and = strategyCondation.judgeAnd(strategyParam);

        return or && and;
    }

    /**
     * 策略执行方法
     *
     * @param strategyParam
     */
    void execute(MarketingParam strategyParam);

}
