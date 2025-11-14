package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;

public interface IUserService {
    User createUser(CreateUserRequest request);
}
