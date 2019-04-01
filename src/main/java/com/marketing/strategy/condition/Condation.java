/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing.strategy.condition;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/26 9:23
 */
@Data
public class Condation<T> implements Serializable{

    /**
     * 指定某个
     */
    private T eq;

    /**
     * 指定排除某个
     */
    private T notEq;

    /**
     * 最大
     */
    private T max;


    /**
     * 最小
     */
    private T min;


    /**
     * 开始时间
     */
    private T start;

    /**
     * 结束时间
     */
    private T end;

    /**
     * 指定包含的ID
     */
    private List<T> include;

    /**
     * 指定排除某些
     */
    private List<T> exclude;



}