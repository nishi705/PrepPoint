package com.example.splitwise.dtos;

import com.example.splitwise.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserResponseDTO {
    private User user;
    private ResponseStatus responseStatus;
}
