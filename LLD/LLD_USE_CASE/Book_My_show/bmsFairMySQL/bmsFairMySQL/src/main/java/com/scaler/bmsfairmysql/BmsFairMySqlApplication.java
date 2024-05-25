package com.scaler.bmsfairmysql;

//import com.scaler.bmsfairmysql.controllers.TicketController;
//import com.scaler.bmsfairmysql.services.TicketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmsFairMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsFairMySqlApplication.class, args);


        // parking lot like setup is not required because spring will do it
        // by using @controller, @service, @repository and @autowired

    }

}
