package com.test.strategy;


import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class StrategyContent {

    /**
     * 排序字段
     */
    private int sort;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 策略的类型
     */
    private String type;


    /**
     * 策略的条件 条件之间是或的关系，条件内不是且的关系
     */
    private List<StrategyCondation> condations;


    /**
     * 复合条件后执行的规则
     */
    private StrategyRule rule;


    /**
     * 体检判断后，筛选后的原始数据
     */
    private Map targetExexuteSource;


}
