package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.UserRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.admin.IAdminService;
import com.jupitters.universalpetcare.service.patient.IPatientService;
import com.jupitters.universalpetcare.service.veterinarian.IVeterinarianService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final IVeterinarianService veterinaryService;
    private final IPatientService patientService;
    private final IAdminService adminService;


}
