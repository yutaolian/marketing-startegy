package com.test.strategy.condition;


import lombok.Builder;

import java.util.List;


/**
 * 需要时自己完善
 */
@Builder(toBuilder=true)
public class Subject {


    private List<Integer> include;

    private List<Integer> exclude;

    /**
     * 指定某个学科
     */
    private Integer eq;
}
