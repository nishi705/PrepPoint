package FairWork.ParkingLot.controllers;

import FairWork.ParkingLot.dtos.GenerateTicketRequestDTO;
import FairWork.ParkingLot.dtos.GenerateTicketResponseDTO;
import FairWork.ParkingLot.dtos.ResponseStatus;
import FairWork.ParkingLot.exceptions.NoParkingSlotAvailableException;
import FairWork.ParkingLot.models.Gate;
import FairWork.ParkingLot.models.Operator;
import FairWork.ParkingLot.models.Ticket;
import FairWork.ParkingLot.models.Vehicle;
import FairWork.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO request){
        GenerateTicketResponseDTO responseDTO = new GenerateTicketResponseDTO();

        try {
            Ticket ticket = ticketService.generateTicket(
                    request.getGateId(), request.getVehicleNumber(), request.getVehicleType()
            );
            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch(NoParkingSlotAvailableException ex){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(ex.getMessage());
        }

        return responseDTO;
    }
}

// get gate
// either get vehicle from db or register
// assigning the parking slot

// ts, gs and vs from the tc itself
// ts and then ts calls gs and vs
