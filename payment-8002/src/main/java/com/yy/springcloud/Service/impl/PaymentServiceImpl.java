package com.yy.springcloud.Service.impl;

import com.yy.springcloud.Dao.PaymentDao;
import com.yy.springcloud.Service.PaymentService;
import com.yy.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public Payment get(String id) {
        return paymentDao.get(id);
    }
}
