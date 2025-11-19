package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.request.UpdateUserRequest;

public interface IUserService {
    User createUser(CreateUserRequest request) throws ResourceAlreadyExistsException;

    User updateUser(Long userId, UpdateUserRequest request);
}
