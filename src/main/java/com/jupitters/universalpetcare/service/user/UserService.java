package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.exceptions.ResourceNotFoundException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.UserRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.request.UpdateUserRequest;
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

    @Override
    public User createUser(CreateUserRequest request){
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new ResourceAlreadyExistsException("Oops, " + request.getEmail() + " is already registered!");
        }

        switch (request.getUserType()){
            case "VET" -> {
                return veterinaryService.createVeterinarian(request);
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

    @Override
    public User updateUser(Long userId, UpdateUserRequest request) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found!"));
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setGender(request.getGender());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setSpecialization(request.getSpecialization());
        return userRepository.save(user);
    }
}
