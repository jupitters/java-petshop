package com.jupitters.universalpetcare.service.veterinary;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.model.Veterinary;
import com.jupitters.universalpetcare.request.CreateUserRequest;

public interface IVeterinaryService {
    public User createVeterinary(CreateUserRequest request);
}
