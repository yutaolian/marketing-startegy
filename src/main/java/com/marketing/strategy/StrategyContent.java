package com.marketing.strategy;


import lombok.Data;

import java.util.Map;

/**
 * @author lianyutao
 */
@Data
public class StrategyContent {

    /**
     * 排序字段
     */
    private int priority;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 策略的类型
     */
    private String type;


    /**
     * 策略的条件 多条件之间是或的关系
     */
//    private List<StrategyCondation> condations;


    private StrategyCondation condation;


    /**
     * 复合条件后执行的规则
     */
    private StrategyRule rule;


    /**
     * 条件判断后 ,根据规则筛选出的原始数据
     */
    private Map targetExexuteSource;


}
