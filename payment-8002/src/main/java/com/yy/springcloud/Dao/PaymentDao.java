package com.yy.springcloud.Dao;

import com.yy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    Payment get(String id);
}
