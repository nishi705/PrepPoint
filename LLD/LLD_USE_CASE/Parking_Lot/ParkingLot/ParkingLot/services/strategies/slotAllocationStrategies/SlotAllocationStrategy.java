package FairWork.ParkingLot.services.strategies.slotAllocationStrategies;

import FairWork.ParkingLot.models.Gate;
import FairWork.ParkingLot.models.ParkingSlot;
import FairWork.ParkingLot.models.enums.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot assignSlot(Gate gate, VehicleType vehicle);
}
