package com.test.strategy.condition;


import lombok.Builder;

import java.math.BigDecimal;

@Builder(toBuilder=true)
public class Price {

    private BigDecimal max;

    private BigDecimal min;

    /**
     * 指定某个金额
     */
    private BigDecimal eq;
}
