package com.example.splitwise.commands;

import com.example.splitwise.controllers.UserController;
import com.example.splitwise.dtos.RegisterUserRequestDTO;
import com.example.splitwise.dtos.RegisterUserResponseDTO;
import com.example.splitwise.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
// RegisterUser A 9999888877 xyz
public class RegisterUserCommand implements Command {
    private UserController userController;

    @Autowired
    public RegisterUserCommand(UserController userController){
        this.userController = userController;
    }

    @Override
    public boolean canExecute(String input) {
        if(input.startsWith("RegisterUser") == false){
            return false;
        } else if(input.split(" ").length != 4){
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        List<String> params = Arrays.stream(input.split(" ")).toList();

        String name = params.get(1);
        String phone = params.get(2);
        String password = params.get(3);

        RegisterUserRequestDTO requestDTO = new RegisterUserRequestDTO();
        requestDTO.setName(name);
        requestDTO.setPhone(phone);
        requestDTO.setPassword(password);

        RegisterUserResponseDTO responseDTO = userController.registerUser(requestDTO);
        User savedUser = responseDTO.getUser();
        System.out.println(savedUser.getId() + " is the id of neawly created user");
    }
}
