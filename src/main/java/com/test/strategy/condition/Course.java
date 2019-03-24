package com.test.strategy.condition;

import lombok.Builder;

import java.util.List;


@Builder(toBuilder=true)
public class Course {

    /**
     * 指定包含的课程ID
     */
    private List<Integer> include;

    /**
     * 指定排除某些课程
     */
    private List<Integer> exclude;

    /**
     * 指定某个课程
     */
    private Integer eq;


    /**
     * 指定排除某个课程
     */
    private Integer notEq;


}
