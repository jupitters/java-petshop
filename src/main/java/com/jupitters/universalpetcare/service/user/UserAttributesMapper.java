package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserAttributesMapper {
    public void setCommonAttributes(CreateUserRequest source, User target) {
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setGender(source.getGender());
        target.setPhoneNumber(source.getPhoneNumber());
        target.setEmail(source.getEmail());
        target.setPassword(source.getPassword());
        target.setUserType(source.getUserType());
        target.setEnabled(source.isEnabled());
        target.setSpecialization(source.getSpecialization());
    }
}
