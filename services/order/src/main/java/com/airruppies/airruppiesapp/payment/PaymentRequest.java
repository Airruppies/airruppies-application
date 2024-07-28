package com.airruppies.airruppiesapp.payment;

import com.airruppies.airruppiesapp.customer.CustomerResponse;
import com.airruppies.airruppiesapp.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}