package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.UserRepository;
import com.jupitters.universalpetcare.repository.VeterinaryRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.admin.AdminService;
import com.jupitters.universalpetcare.service.patient.PatientService;
import com.jupitters.universalpetcare.service.veterinary.VeterinaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final VeterinaryService veterinaryService;
    private final PatientService patientService;
    private final AdminService adminService;

    @Override
    public User createUser(CreateUserRequest request){

    }
}
