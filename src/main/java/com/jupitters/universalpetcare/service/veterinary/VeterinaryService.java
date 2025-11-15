package com.jupitters.universalpetcare.service.veterinary;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.model.Veterinary;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VeterinaryService implements IVeterinaryService{
    private final UserAttributesMapper userAttributesMapper;

    @Override
    public User createVeterinary(CreateUserRequest request) {
        Veterinary veterinary = new Veterinary();
        userAttributesMapper.setCommonAttributes(request, veterinary);
        veterinary.setSpecialization(request.getSpecialization());

        return veterinary;
    }
}
