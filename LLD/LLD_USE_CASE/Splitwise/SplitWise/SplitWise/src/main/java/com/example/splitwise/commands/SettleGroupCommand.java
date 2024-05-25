package com.example.splitwise.commands;

import com.example.splitwise.controllers.GroupController;
import com.example.splitwise.dtos.SettleGroupRequestDTO;
import com.example.splitwise.dtos.SettleGroupResponseDTO;
import com.example.splitwise.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
// SettleGroup 10
public class SettleGroupCommand implements Command{
    private GroupController groupController;

    @Autowired
    public SettleGroupCommand(GroupController groupController){
        this.groupController = groupController;
    }

    @Override
    public boolean canExecute(String input) {
        if(input.startsWith("SettleGroup") == false){
            return false;
        }

        if(input.split(" ").length != 2){
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        List<String> parts = Arrays.stream(input.split(" ")).toList();
        Long groupId = Long.parseLong(parts.get(1));

        SettleGroupRequestDTO requestDTO = new SettleGroupRequestDTO();
        requestDTO.setGroupId(groupId);

        SettleGroupResponseDTO responseDTO = groupController.settleGroup(requestDTO);
        for(Transaction transaction: responseDTO.getTansactions()){
            System.out.println("Execute these transactions to settle the users of group");
            System.out.println(transaction.getFrom() + " -> " + transaction.getTo() + " = " + transaction.getAmount());
        }
    }
}
