package com.scaler.bmsfairmysql.controllers;

import com.scaler.bmsfairmysql.dto.BookTicketRequestDTO;
import com.scaler.bmsfairmysql.dto.BookTicketResponseDTO;
import com.scaler.bmsfairmysql.dto.ResponseStatus;
import com.scaler.bmsfairmysql.dto.StatusCode;
import com.scaler.bmsfairmysql.models.ShowSeat;
import com.scaler.bmsfairmysql.models.Ticket;
import com.scaler.bmsfairmysql.models.User;
import com.scaler.bmsfairmysql.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO requestDTO){
        BookTicketResponseDTO responseDTO = new BookTicketResponseDTO();

        try{
            Ticket ticket = ticketService.bookTicket(requestDTO.getShowSeatIds(), requestDTO.getUserId());

            ResponseStatus rs = new ResponseStatus();
            rs.setCode(StatusCode.SUCCESS);

            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(rs);
        } catch(Exception ex){
            ResponseStatus rs = new ResponseStatus();
            rs.setCode(StatusCode.FAILURE);
            rs.setMessage(ex.getMessage());

            responseDTO.setResponseStatus(rs);
        }

        return responseDTO;
    }
}
