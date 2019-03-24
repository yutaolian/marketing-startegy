package com.test.strategy;

import com.test.strategy.impl.StartegyB;


public class MarketingContext {

    private MarketingStrategyParam strategyParam;

    public MarketingContext(MarketingStrategyParam strategyParam) {
        this.strategyParam = strategyParam;
    }

    public void execute(){
        //获取策略名称（约定策略名为策略的注解名称）

        //根据对应的名字找出具体的处理策略
        String name = strategyParam.getStrategyContent().getName();
//        MarketingStrategy bean =  (MarketingStrategy)SpringContextUtil.getBean(name);



        MarketingStrategy strategy = new StartegyB();
        strategy.execute(strategyParam);

    }
}
