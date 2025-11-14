package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.UserRepository;
import com.jupitters.universalpetcare.repository.VeterinarianRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;
    private final VeterinarianRepository veterinarianRepository;

    @Override
    public User createUser(CreateUserRequest request){
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new ResourceAlreadyExistsException("Oops, " + request.getEmail() + " is already registered!");
        }

        switch (request.getUserType()){
            case "VET" -> {

            }
        }
    }
}
