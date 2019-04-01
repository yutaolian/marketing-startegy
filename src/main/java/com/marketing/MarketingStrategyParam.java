package com.marketing;


import com.marketing.strategy.StrategyContent;
import lombok.Data;
import lombok.experimental.Builder;

/**
 * 封装策略和外部数据
 *
 *
 */


@Data
@Builder
public class MarketingStrategyParam {

    /**
     * 策略内容具体内容
     */
    private String strategyContentStr;

    /**
     * 外部数据
     */
   // private OrderDomain orderDomain;


    private StrategyContent strategyContent;


}
