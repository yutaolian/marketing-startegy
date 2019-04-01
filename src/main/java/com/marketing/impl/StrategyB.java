package com.marketing.impl;


import com.marketing.MarketingStrategyParam;
import com.marketing.strategy.BaseStrategy;
import com.marketing.strategy.MarketingStrategy;
import com.marketing.strategy.StrategyContent;

public class StrategyB extends BaseStrategy implements MarketingStrategy {


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

    /**
     * 公共的条件逻辑判断
     * <p>
     * 这里建议使用jdk8 stream 来处理 function接口
     * 中的谓词 Predicate 他的默认方法实现了与或非的
     *
     * @param strategyParam
     * @return
     */
    @Override
    protected boolean judge(MarketingStrategyParam strategyParam) {
        return super.judge(strategyParam);
    }
}
