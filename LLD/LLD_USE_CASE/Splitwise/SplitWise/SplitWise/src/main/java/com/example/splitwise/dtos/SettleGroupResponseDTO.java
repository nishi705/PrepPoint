package com.example.splitwise.dtos;

import com.example.splitwise.models.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleGroupResponseDTO {
    private List<Transaction> tansactions;
    private ResponseStatus responseStatus;
}
