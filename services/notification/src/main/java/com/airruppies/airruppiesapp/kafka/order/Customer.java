package com.airruppies.airruppiesapp.kafka.order;

public record Customer(
        String id,
        String firstname,
        String lastname,
        String email
) {

}