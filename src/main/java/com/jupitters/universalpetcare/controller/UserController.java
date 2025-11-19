package com.jupitters.universalpetcare.controller;

import com.jupitters.universalpetcare.dto.EntityConverter;
import com.jupitters.universalpetcare.dto.UserDto;
import com.jupitters.universalpetcare.exceptions.ResourceAlreadyExistsException;
import com.jupitters.universalpetcare.exceptions.ResourceNotFoundException;
import com.jupitters.universalpetcare.model.User;
import com.jupitters.universalpetcare.request.CreateUserRequest;
import com.jupitters.universalpetcare.request.UpdateUserRequest;
import com.jupitters.universalpetcare.response.ApiResponse;
import com.jupitters.universalpetcare.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("${url.api}/users")
public class UserController {
    private final UserService userService;
    private final EntityConverter<User, UserDto> entityConverter;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> add(@RequestBody CreateUserRequest request){
        try {
            User user = userService.createUser(request);
            UserDto userDto = entityConverter.mapEntityToDto(user, UserDto.class);
            return ResponseEntity.ok(new ApiResponse("Success!", userDto));
        } catch (ResourceAlreadyExistsException e) {
            return ResponseEntity.status(CONFLICT)
                    .body(new ApiResponse(e.getMessage(), null));
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(e.getMessage(), null));
        }
    }

    @PatchMapping("/{userId}/update")
    public ResponseEntity<ApiResponse> updateUser(@PathVariable Long userId, @RequestBody UpdateUserRequest request){
        try {
            User oldUser = userService.updateUser(userId, request);
            UserDto updatedUser = entityConverter.mapEntityToDto(oldUser, UserDto.class);
            return ResponseEntity.ok(new ApiResponse("Updated Successfully!", updatedUser));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND)
                    .body(new ApiResponse(e.getMessage(), null));
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(e.getMessage(), null));
        }
    }

    public ResponseEntity<ApiResponse> getUser(Long userId) {
        try {
            User user = userService.getUser(userId);
            UserDto userDto = entityConverter.mapEntityToDto(user, UserDto.class);
            return ResponseEntity.ok(new ApiResponse("Success!", userDto));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND)
                    .body(new ApiResponse(e.getMessage(), null));
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(e.getMessage(), null));
        }
    }
}
