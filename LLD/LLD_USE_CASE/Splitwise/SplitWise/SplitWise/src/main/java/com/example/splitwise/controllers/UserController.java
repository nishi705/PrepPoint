package com.example.splitwise.controllers;

import com.example.splitwise.dtos.*;
import com.example.splitwise.dtos.ResponseStatus;
import com.example.splitwise.models.User;
import com.example.splitwise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


// Steps
// 1. Maven Repostiory
// 2. Update POM XML
// 3. @RestController
// 4. @PostMapping or @GetMapping
// 5. Retrieve information from HTTP Request to make requestDTOs
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/register/")
    public RegisterUserResponseDTO registerUser(@RequestBody() RegisterUserRequestDTO requestDTO){
        RegisterUserResponseDTO responseDTO = new RegisterUserResponseDTO();

        User user = new User();
        user.setName(requestDTO.getName());
        user.setPhone(requestDTO.getPhone());
        user.setPassword(requestDTO.getPassword());

        try {
            User savedUser = userService.registerUser(user);
            responseDTO.setUser(savedUser);

            ResponseStatus responseStatus = new ResponseStatus();
            responseStatus.setCode(StatusCode.SUCCESS);
            responseStatus.setMessage("User registered successfully");
            responseDTO.setResponseStatus(responseStatus);
        } catch(Exception ex){
            ResponseStatus responseStatus = new ResponseStatus();
            responseStatus.setCode(StatusCode.FAILURE);
            responseStatus.setMessage(ex.getMessage());
            responseDTO.setResponseStatus(responseStatus);
        }

        return responseDTO;
    }

    @GetMapping("/user/get/")
    public GetUserResponseDTO getUser(@RequestParam() Long userId){
        GetUserResponseDTO responseDTO = new GetUserResponseDTO();
//        Long userId = requestDTO.getId();

        try {
            User user = userService.getUser(userId);
            responseDTO.setUser(user);

            ResponseStatus responseStatus = new ResponseStatus();
            responseStatus.setCode(StatusCode.SUCCESS);
            responseStatus.setMessage("User retrieved successfully");
            responseDTO.setResponseStatus(responseStatus);
        } catch(Exception ex){
            ResponseStatus responseStatus = new ResponseStatus();
            responseStatus.setCode(StatusCode.FAILURE);
            responseStatus.setMessage(ex.getMessage());
            responseDTO.setResponseStatus(responseStatus);
        }

        return responseDTO;
    }
}
