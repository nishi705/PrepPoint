package FairWork.ParkingLot.services.strategies.slotAllocationStrategies;

import FairWork.ParkingLot.models.Gate;
import FairWork.ParkingLot.models.ParkingLot;
import FairWork.ParkingLot.models.ParkingSlot;
import FairWork.ParkingLot.models.enums.ParkingSlotStatus;
import FairWork.ParkingLot.models.enums.VehicleType;
import FairWork.ParkingLot.repositories.ParkingLotRepository;
import FairWork.ParkingLot.repositories.ParkingSlotRepository;

import java.util.List;

public class FirstSlotAvailableStrategy implements SlotAllocationStrategy {
    private ParkingLotRepository parkingLotRepository;
    private ParkingSlotRepository parkingSlotRepository;

    public FirstSlotAvailableStrategy(ParkingLotRepository parkingLotRepository, ParkingSlotRepository parkingSlotRepository){
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }
    @Override
    public ParkingSlot assignSlot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGate(gate);
        List<ParkingSlot> allParkingSlots = parkingSlotRepository.getAllParkingSlotsByParkingLot(parkingLot);

        for(ParkingSlot ps: allParkingSlots){
            if(ps.getSlotStatus().equals(ParkingSlotStatus.AVAILABLE) &&
               ps.getSupportedVehicleTypes().contains(vehicleType)){
                return ps;
            }
        }

        return null;
    }
}
