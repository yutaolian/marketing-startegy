package com.marketing.impl;


import com.marketing.strategy.BaseStrategy;
import com.marketing.strategy.MarketingStrategy;
import com.marketing.MarketingStrategyParam;
import com.marketing.strategy.StrategyContent;
import com.marketing.strategy.StrategyRule;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("strategyA")
public class StrategyA extends BaseStrategy implements MarketingStrategy {


    /**
     * 具体策略的实施
     * @param strategyParam
     */
    @Override
    public void execute(MarketingStrategyParam strategyParam) {
        System.out.println("这里是 A 策略");
        StrategyContent strategyContent = strategyParam.getStrategyContent();
        boolean flag = this.judge(strategyParam);
        if (!flag) {
            return;
        }else{
            StrategyRule rule = strategyContent.getRule();
            //策略判断后应该过滤出业务侧满足策略的对象
            //以便快速实现结构的处理
            Map targetExexuteSource = strategyContent.getTargetExexuteSource();

            //TODO 执行具体的满足策略后的结果

        }
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
