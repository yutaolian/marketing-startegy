package com.marketing.impl;


import com.marketing.strategy.MarketingStrategy;
import com.marketing.MarketingStrategyParam;
import com.marketing.strategy.StrategyContent;
import com.marketing.strategy.StrategyRule;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("strategyA")
public class StrategyA implements MarketingStrategy {

    /**
     * 具体策略的实施
     *
     * @param strategyParam
     */


    @Override
    public void execute(MarketingStrategyParam strategyParam) {
        System.out.println("这里是 A 策略");
        StrategyContent strategyContent = strategyParam.getStrategyContent();
        StrategyRule rule = strategyContent.getRule();
        //策略判断后应该过滤出业务侧满足策略的对象
        //以便快速实现结构的处理
        Map targetExexuteSource = strategyContent.getTargetExexuteSource();

        boolean judge = this.judge(strategyParam);
        if (!judge){
            return;
        }

        //TODO 执行具体的满足策略后的结果

    }

}
