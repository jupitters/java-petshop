package com.jupitters.universalpetcare.service.patient;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;

public interface IPatientService {
    public User createPatient(CreateUserRequest request);
}
