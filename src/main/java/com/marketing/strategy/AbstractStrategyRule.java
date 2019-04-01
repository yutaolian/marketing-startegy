package com.marketing.strategy;



import lombok.Data;
import lombok.experimental.Builder;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 抽象的规则类
 *
 */
@Data
public abstract class AbstractStrategyRule implements Serializable{

    /**
     * 类型
     */
    private String type;

    /**
     * 作用的地方
     */
    private String target;



}
