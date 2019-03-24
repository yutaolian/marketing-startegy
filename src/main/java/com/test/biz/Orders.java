package com.test.biz;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Orders {

    //业务系统得到的订单或者其他数据

    private Integer id;

    private BigDecimal pirce;


}
