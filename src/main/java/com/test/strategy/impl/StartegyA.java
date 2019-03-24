package com.test.strategy.impl;


import com.test.biz.Orders;
import com.test.strategy.*;

import java.util.List;
import java.util.Map;


public class StartegyA implements MarketingStrategy {


    /**
     * 具体策略的实施
     * @param strategyParam
     */
    @Override
    public void execute(MarketingStrategyParam strategyParam) {
        System.out.println("这里是 A 策略");
        StrategyContent strategyContent = strategyParam.getStrategyContent();
        boolean flag = judge(strategyParam);
        if (flag) {
            StrategyRule rule = strategyContent.getRule();


            //策略判断后应该过滤出业务侧满足策略的对象
            //以便快速实现结构的处理

            Map targetExexuteSource = strategyContent.getTargetExexuteSource();


            //TODO 执行具体的满足策略后的结果


        }else{
            return;
        }


    }


    /**
     *
     *  这里建议使用jdk8 stream 来处理 function接口
     *  中的谓词 Predicate 他的默认方法实现了与或非的
     *
     *
     * @param strategyParam
     * @return
     */
    private boolean judge(MarketingStrategyParam strategyParam) {
        //多条件判断
        List<StrategyCondation> condations = strategyParam.getStrategyContent().getCondations();

        Orders orders = strategyParam.getOrder();

//        condations.stream().filter(test());
        return true;

    }

}
