package com.jupitters.universalpetcare.controller;

import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${url.api}/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/add")
    public RequestEntity<ApiResponse> add(@RequestBody CreateUserRequest request){
        return userService.createUser(request);
    }
}
