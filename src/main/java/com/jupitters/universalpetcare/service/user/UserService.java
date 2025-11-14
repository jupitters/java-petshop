package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.UserRepository;
import com.jupitters.universalpetcare.repository.VeterinaryRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.veterinary.VeterinaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final VeterinaryService veterinaryService;

    @Override
    public User createUser(CreateUserRequest request){
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new ResourceAlreadyExistsException("Oops, " + request.getEmail() + " is already registered!");
        }

        switch (request.getUserType()){
            case "VET" -> {
                return veterinaryService.createVeterinary(request);
            }
            case "PATIENT" -> {
                return patientService.createPatient(request);
            }
            case "ADMIN" -> {
                return adminService.createAdmin(request);
            }
            default -> {
                return null;
            }
        }
    }
}
