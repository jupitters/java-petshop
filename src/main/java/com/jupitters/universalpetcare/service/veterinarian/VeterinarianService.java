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


}
