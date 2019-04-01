/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing;

import com.google.gson.Gson;
import com.marketing.strategy.MarketingContext;
import com.marketing.strategy.condition.StrategyCondation;
import com.marketing.strategy.StrategyContent;
import com.marketing.strategy.StrategyRule;
import com.marketing.strategy.condition.Condation;
import com.test.strategy.impl.StartegyA;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/25 11:01
 */
public class MarketingStrategyTest {


    public static void main(String[] args) {



        //数据库存档额策略内容
        StrategyContent strategyContent = new StrategyContent();

        //生成模拟数据
        strategyContent.setName("startegyA");

        Condation<BigDecimal> price = new Condation();
        price.setEq(new BigDecimal(1));

        Condation<Integer> course = new Condation();
        course.setInclude(Arrays.asList(1380, 1361));


        Map<String,Condation> condationMap  = new HashMap<>();
        condationMap.put("price",price);
        condationMap.put("course",course);



        Condation<Date> time = new Condation();
        time.setEq(new Date());


        Map<String,Condation> subCondationMap2  = new HashMap<>();
        subCondationMap2.put("time",time);

        //条件1

        StrategyCondation subCondation2 = StrategyCondation.builder().multCondation(subCondationMap2).build();



        //

        Condation<Integer> grade = new Condation();
        grade.setEq(1);


        Map<String,Condation> subCondationMap  = new HashMap<>();
        subCondationMap.put("grade",grade);

        //条件1

        StrategyCondation subCondation = StrategyCondation.builder().multCondation(subCondationMap).subCondatiion(subCondation2).build();

        //条件1

        StrategyCondation strategyCondation = StrategyCondation.builder().multCondation(condationMap).subCondatiion(subCondation).build();


        strategyContent.setCondations(Arrays.asList(strategyCondation));

        //结果

        StrategyRule strategyRule = new StrategyRule();
        strategyRule.setTarget("order");
        strategyRule.setDerate(new BigDecimal("-66.6"));
        strategyContent.setRule(strategyRule);
        Field[] fields = StrategyCondation.class.getFields();


        Class<? extends StrategyContent> aClass = strategyContent.getClass();

        Method[] methods = aClass.getMethods();

        System.out.println(methods);

       // System.out.println(strategyContent.getClass().getGenericInterfaces());


        MarketingStrategyParam strategyParam = MarketingStrategyParam.builder()
                .strategyContent(strategyContent).build();
        //这行策略
        //new MarketingContext(strategyParam).execute();

    }



}