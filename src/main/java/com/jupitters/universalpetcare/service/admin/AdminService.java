package com.jupitters.universalpetcare.service.admin;

import com.jupitters.universalpetcare.model.Admin;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.repository.AdminRepository;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdminService implements IAdminService{
    private final UserAttributesMapper userAttributesMapper;
    private final AdminRepository adminRepository;

    @Override
    public User createAdmin(CreateUserRequest request) {
        Admin admin = new Admin();
        userAttributesMapper.setCommonAttributes(request, admin);

        return adminRepository.save(admin);
    }
}
