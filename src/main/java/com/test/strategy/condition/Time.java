package com.test.strategy.condition;

import lombok.Builder;

import java.util.Date;

@Builder(toBuilder=true)
public class Time {

    /**
     * 开始时间
     */
    private Date start;

    /**
     * 结束时间
     */
    private Date end;

    /**
     * 指定时间
     */
    private Date eq;

}
