/*
 * Copyright (c) 2016,gaosiedu.com
 */
package com.marketing.strategy;

import com.marketing.MarketingStrategyParam;
import com.marketing.strategy.condition.Condation;
import com.marketing.strategy.condition.StrategyCondation;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author lianyutao
 * @version 3.0.0
 * @description
 * @date 2019/3/25 22:23
 */
public abstract class BaseStrategy {

    /**
     * 公共的条件逻辑判断
     * <p>
     * 这里建议使用jdk8 stream 来处理 function接口
     * 中的谓词 Predicate 他的默认方法实现了与或非的
     *
     * @param strategyParam
     * @return
     */
    protected boolean judge(MarketingStrategyParam strategyParam) {

        StrategyContent strategyContent = strategyParam.getStrategyContent();
        //件判断
        List<StrategyCondation> condations = strategyContent.getCondations();

//        this.or(c)

        //BiPredicate
        // condations.stream().allMatch(condation -> this.or(condation,cm -> this.multAnd(cm.getMultCondation(),m -> m.entrySet().stream().allMatch(i -> this.multAnd(i.getValue(),c -> c.getEq().equals(1)).test(1)));


        // condations.stream().anyMatch();


        //condations.stream().anyMatch();

        //Condation course = condation.getCourse();


        //  Predicate<String> condition1 = courseId->courseId.equals(course.getEq());

        // Predicate<String> condition2 = subjectId->subjectId.endsWith("h");


        //参与的课程
        //List<Integer> courseIds = course.getInclude();


        //OrderDomain orderDomain = strategyParam.getOrderDomain();
        //List<OrderItemDomain> orderItemList = orderDomain.getOrderItemList();
        // orderItemList.stream().filter(item -> checkCourseIdEq(item.getCourseId(),));

        return false;
    }

    /**
     * 多个condition 使用or
     *
     * @param conditions
     * @param conditionPredicate
     * @return
     */
    private void test11(List<StrategyCondation> conditions, Predicate<StrategyCondation> conditionPredicate) {
        conditions.forEach(condition -> {
            conditionPredicate.test(condition);
        });

        conditions.stream().forEach(strategyCondation -> {
            Condation couse = strategyCondation.getCouse();



            Map<String, Condation> multCondation = strategyCondation.getMultCondation();
            multCondation.forEach((k,v) ->{
                if (k.equals("course")){
//                    v.getEq().equals()
                }
            });
        });

    }

    /**
     * 多个condition 使用or
     *
     * @param condition
     * @param conditionPredicate
     * @return
     */
    private Predicate or(StrategyCondation condition, Predicate<StrategyCondation> conditionPredicate) {
        return conditionPredicate.or((Predicate<? super StrategyCondation>) condition);
    }


    /**
     * 多个condition 使用and
     *
     * @param condition
     * @param conditionPredicate
     * @return
     */
    private Predicate multAnd(Map<String, Condation> condition, Predicate<Map<String, Condation>> conditionPredicate) {
        return conditionPredicate.or((Predicate<? super Map<String, Condation>>) condition);
    }


    /**
     * 多个condition 使用and
     *
     * @param condition
     * @param conditionPredicate
     * @return
     */
    private Predicate multAnd(Condation condition, Predicate<Condation> conditionPredicate) {
        return conditionPredicate.or((Predicate<? super Condation>) condition);
    }


//    private boolean condation(StrategyCondation condation, OrderDomain orderDomain) {
//
//        if (condation.getSubCondatiion() != null) {
//            // condation.getCourse().getEq().equals(1);
//
//
//            return false;
//            //List<StrategyCondation> subCondatiions = condation.getSubCondatiions();
//            //subCondatiions.forEach(item -> this.condation(item));
//        }
//        return false;
//    }
}