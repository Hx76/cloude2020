package com.example.cloud.service.impl;

import com.example.cloud.dao.PaymentDao;
import com.example.cloud.entities.Payment;
import com.example.cloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(@Param("id")Long id){
        return paymentDao.getPaymentById(id);
    }

}
