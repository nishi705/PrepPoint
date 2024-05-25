package com.example.splitwise.controllers;

import com.example.splitwise.dtos.ResponseStatus;
import com.example.splitwise.dtos.SettleGroupRequestDTO;
import com.example.splitwise.dtos.SettleGroupResponseDTO;
import com.example.splitwise.dtos.StatusCode;
import com.example.splitwise.models.Transaction;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GroupController {

    public SettleGroupResponseDTO settleGroup(SettleGroupRequestDTO requestDTO){
        Long groupId = requestDTO.getGroupId();

        // here we will call service, which will use strategies and call repositories
        SettleGroupResponseDTO responseDTO = new SettleGroupResponseDTO();

        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setCode(StatusCode.SUCCESS);
        responseStatus.setMessage("Group settlement transactions retrieved successfully");

        responseDTO.setResponseStatus(responseStatus);

        List<Transaction> transactionList = new ArrayList<>();
        Transaction t1 = new Transaction();
        t1.setFrom("A");
        t1.setTo("B");
        t1.setAmount(10);

        transactionList.add(t1);

        Transaction t2 = new Transaction();
        t2.setFrom("B");
        t2.setTo("C");
        t2.setAmount(20);

        transactionList.add(t2);

        responseDTO.setTansactions(transactionList);
        return responseDTO;
    }
}
