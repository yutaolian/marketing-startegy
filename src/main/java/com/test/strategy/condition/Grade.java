package com.test.strategy.condition;


import lombok.Builder;

import java.util.List;

@Builder(toBuilder=true)
public class Grade {


    private List<Integer> include;

    private List<Integer> exclude;

    /**
     * 指定某个年级
     */
    private Integer eq;
}
