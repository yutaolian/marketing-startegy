package com.marketing.impl;


import com.marketing.MarketingStrategyParam;
import com.marketing.strategy.MarketingStrategy;
import com.marketing.strategy.StrategyContent;

public class StrategyB implements MarketingStrategy {


    /**
     * 具体策略的实施
     * @param strategyParam
     */
    @Override
    public void execute(MarketingStrategyParam strategyParam) {

        StrategyContent strategyContent = strategyParam.getStrategyContent();
        //策略内部求
       // List<StrategyCondation> condations = strategyContent.getCondations();


        System.out.println("这里是 B 策略");

    }

}
