package FairWork.ParkingLot.models;

import FairWork.ParkingLot.models.enums.PaymentMode;
import FairWork.ParkingLot.models.enums.PaymentStatus;

public class Payment extends BaseModel  {
    private Bill bill;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
