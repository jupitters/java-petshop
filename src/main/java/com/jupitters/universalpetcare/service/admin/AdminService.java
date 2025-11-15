package com.jupitters.universalpetcare.service.admin;

import com.jupitters.universalpetcare.model.Admin;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{
    private UserAttributesMapper userAttributesMapper;

    @Override
    public User createAdmin(CreateUserRequest request) {
        Admin admin = new Admin();
        userAttributesMapper.setCommonAttributes(request, admin);

        return admin;
    }
}
