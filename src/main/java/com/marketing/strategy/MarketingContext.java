package com.marketing.strategy;


import com.marketing.MarketingStrategyParam;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.marketing.impl.StrategyA;

import java.lang.reflect.Type;


/**
 * @author lianyutao
 */
public class MarketingContext {

    private MarketingStrategyParam strategyParam;

    public MarketingContext(MarketingStrategyParam strategyParam) {
        this.strategyParam = strategyParam;
    }

    /**
     * 策略关系映射
     * 使用gson typeToken 泛型解析对象
     *
     * 获取策略名称（约定策略名为策略的注解名称）
     */
    public void execute(){
        String strategyContentStr = strategyParam.getStrategyContentStr();
        Type type = new TypeToken<StrategyContent>(){}.getType();
        StrategyContent strategyContent = new Gson().fromJson(strategyContentStr, type);
        //log.info(JSON.toJSONString(strategyContent));
        strategyParam.setStrategyContent(strategyContent);
        MarketingStrategy strategy = new StrategyA();
        boolean judge = strategy.judge(strategyParam);
        if (!judge){
            return;
        }
        strategy.execute(strategyParam);
    }
}
