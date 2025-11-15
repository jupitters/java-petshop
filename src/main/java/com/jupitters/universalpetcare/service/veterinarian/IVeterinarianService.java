package com.jupitters.universalpetcare.service.veterinarian;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;

public interface IVeterinarianService {
    public User createVeterinarian(CreateUserRequest request);
}
