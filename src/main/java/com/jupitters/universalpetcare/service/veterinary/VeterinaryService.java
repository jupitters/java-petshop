package com.jupitters.universalpetcare.service.veterinary;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.model.Veterinary;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VeterinaryService implements IVeterinaryService{
    private final UserAttributesMapper userAttributesMapper;


}
