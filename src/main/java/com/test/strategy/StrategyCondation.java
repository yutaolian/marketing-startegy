package com.test.strategy;


import com.test.strategy.condition.*;
import lombok.Builder;

import java.util.List;

/**
 * 策略条件
 *
 * 各策略的优先级可有具体策略具体实现
 */

@Builder(toBuilder = true)
public class StrategyCondation {

    /**
     * 执行优先级
     */
    private int priority;

    private Grade grade;

    private Course course;

    private Subject subject;

    private Price price;

    private Time time;

    private List<StrategyCondation> condatiions;



}
