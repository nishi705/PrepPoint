package com.example.splitwise;

import com.example.splitwise.commands.CommandRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitWiseApplication implements CommandLineRunner {
    CommandRegistry commandRegistry;

    @Autowired
    public SplitWiseApplication(CommandRegistry commandRegistry){
        this.commandRegistry = commandRegistry;
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitWiseApplication.class, args);
    }

    // Violating SRP and OCP
//    @Override
//    public void run(String... args) throws Exception {
//        Scanner scn = new Scanner(System.in);
//        while(true){
//            String input = scn.nextLine();
//            if(input.startsWith("SettleGroup")){
//                // call group controller
//            } else if(input.startsWith("CreateExpense")){
//                // call expense controller
//            }
//        }
//    }


    // SettleGroup 10
    // RegisterUser "A" "9999888877" "xyz"

    @Override
    public void run(String... args) throws Exception {
        Scanner scn = new Scanner(System.in);
        while(true){
            String input = scn.nextLine();
            commandRegistry.execute(input);
        }
    }
}
