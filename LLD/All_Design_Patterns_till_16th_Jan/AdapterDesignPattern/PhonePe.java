package FairWork.AdapterDesignPattern;

public class PhonePe {
    public static void main(String[] args) {
        // can be done via factory, via DIC
        BankAPI bank = new YesBankAdapter();

        bank.balance();
        bank.addMoney(10);

        // This code is free from impact due to change in 3rd party libraries

    }
}
