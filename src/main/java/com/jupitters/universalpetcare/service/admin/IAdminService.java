package com.jupitters.universalpetcare.service.admin;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;

public interface IAdminService {
    public User createAdmin(CreateUserRequest request);
}
