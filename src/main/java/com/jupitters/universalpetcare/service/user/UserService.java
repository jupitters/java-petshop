package com.jupitters.universalpetcare.service.user;

import com.jupitters.universalpetcare.model.User;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    @Override
    public User createUser(User user) {
        return null;
    }
}
