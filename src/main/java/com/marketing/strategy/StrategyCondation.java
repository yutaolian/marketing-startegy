package com.marketing.strategy;


import com.marketing.strategy.condition.Condation;
import com.marketing.strategy.condition.CondationJudge;
import lombok.Data;
import lombok.experimental.Builder;

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
public class StrategyCondation implements StrategyCondationJudge {

    private Map<String,Condation> or;

    private List<StrategyCondation> and;

}
