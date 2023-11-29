package com.example.consumer.dto;

public record UserRegisteredPayload(String fullName, String emailAddress, int confirmationCode) {
}
