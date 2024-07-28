package com.airruppies.airruppiesapp.kafka;

import com.airruppies.airruppiesapp.customer.CustomerResponse;
import com.airruppies.airruppiesapp.order.PaymentMethod;
import com.airruppies.airruppiesapp.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
