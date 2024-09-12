package com.airruppies.usermanagement.model;

public record NewUserRecord(
        String username,
        String password,
        String firstName,
        String lastName) {

}
