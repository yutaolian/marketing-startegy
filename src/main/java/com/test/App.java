package com.test;

import com.alibaba.fastjson.JSONObject;
import com.test.biz.Orders;
import com.test.strategy.MarketingContext;
import com.test.strategy.MarketingStrategyParam;
import com.test.strategy.StrategyCondation;
import com.test.strategy.StrategyContent;
import com.test.strategy.condition.Price;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {


    public static void main(String[] args) {


        //数据库存档额策略内容
        StrategyContent strategyContent = new StrategyContent();

        //生成模拟数据

        strategyContent.setName("startegyA");

        Price price = Price.builder().eq(new BigDecimal(1)).build();

        StrategyCondation strategyCondation = StrategyCondation.builder().price(price).build();
        strategyContent.setCondations(Arrays.asList(strategyCondation));


        System.out.println(JSONObject.toJSONString(strategyContent));


        MarketingStrategyParam strategyParam = MarketingStrategyParam.builder()
                .strategyContent(strategyContent)
                .order(new Orders()).build();


        //这行策略
        new MarketingContext(strategyParam).execute();

    }
}
