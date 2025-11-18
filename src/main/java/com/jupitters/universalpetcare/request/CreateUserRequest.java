package com.jupitters.universalpetcare.request;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String email;
    private String password;
    private String userType;
    private boolean isEnabled;
    private String specialization;
}
