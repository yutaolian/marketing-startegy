package com.test.strategy;


import com.test.biz.Orders;
import lombok.Builder;
import lombok.Data;


/**
 * 封装策略体检和外部数据
 */
@Data
@Builder(toBuilder=true)
public class MarketingStrategyParam {


    private StrategyContent strategyContent;

    /**
     * 外部数据
     */
    private Orders order;

}
