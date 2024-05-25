package com.User.User_Service.service;

import com.User.User_Service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    List<User> list = List.of(
            new User(1L,"nishi","123456"),
            new User(2L,"choti","123678"),
            new User(1L,"nishi","6786456")


    );


    @Override
    public User getUser(Long id) {
        return list .stream().filter(user -> Objects.equals(user.getUserId(), id)).findAny().orElse(null);
    };
}
