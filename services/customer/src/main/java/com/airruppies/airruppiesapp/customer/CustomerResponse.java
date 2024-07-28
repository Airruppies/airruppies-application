package com.airruppies.airruppiesapp.customer;

public record CustomerResponse (
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
){
}
