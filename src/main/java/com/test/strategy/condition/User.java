package com.test.strategy.condition;


import lombok.Builder;

import java.util.List;

@Builder(toBuilder=true)
public class User {

    /**
     * 指定部分人
     */
    private List<Integer> include;

    /**
     * 指定排除部分人
     */
    private List<Integer> exclude;

    /**
     * 指定某人
     */
    private Integer eq;

    /**
     * 指定排除某个人
     */
    private Integer notEq;
}
