package com.test.strategy.impl;


import com.test.strategy.MarketingStrategy;
import com.test.strategy.MarketingStrategyParam;
import com.test.strategy.StrategyCondation;
import com.test.strategy.StrategyContent;

import java.util.List;

public class StartegyB implements MarketingStrategy {


    /**
     * 具体策略的实施
     * @param strategyParam
     */
    @Override
    public void execute(MarketingStrategyParam strategyParam) {

        StrategyContent strategyContent = strategyParam.getStrategyContent();
        //策略内部求
        List<StrategyCondation> condations = strategyContent.getCondations();






        System.out.println("这里是 B 策略");

    }
}
