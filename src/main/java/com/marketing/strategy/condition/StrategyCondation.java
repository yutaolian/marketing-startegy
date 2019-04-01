package com.marketing.strategy.condition;


import lombok.Data;
import lombok.experimental.Builder;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 策略条件
 *
 * 各策略的优先级可有具体策略具体实现
 * @author lianyutao
 */

@Data
@Builder
public class StrategyCondation implements Serializable {
    /**
     * 执行优先级
     */
    private int priority;

    /**
     * 条件之间是 且的关系
     */
    private Map<String,Condation> multCondation;


    private List<StrategyCondation> condations;


    private Condation couse;

    /**
     * 满足condationMap 关系之后才会检验subCondatiions的关系
     */
    private StrategyCondation subCondatiion;



    private Map<String,Condation> orCondation;


    private List<StrategyCondation> andCondations;




}
