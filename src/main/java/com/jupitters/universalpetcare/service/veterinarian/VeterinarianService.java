package com.jupitters.universalpetcare.service.veterinarian;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.model.Veterinarian;
import com.jupitters.universalpetcare.repository.VeterinarianRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VeterinarianService implements IVeterinarianService {
    private final UserAttributesMapper userAttributesMapper;
    private final VeterinarianRepository veterinarianRepository;

    @Override
    public User createVeterinarian(CreateUserRequest request) {
        Veterinarian veterinarian = new Veterinarian();
        userAttributesMapper.setCommonAttributes(request, veterinarian);
        veterinarian.setSpecialization(request.getSpecialization());
        veterinarianRepository.save(veterinarian);

        return veterinarian;
    }
}
