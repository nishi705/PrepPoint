package FairWork.AdapterDesignPattern;

import FairWork.AdapterDesignPattern.thirdparty.YesBank;

public class YesBankAdapter implements BankAPI {
    YesBank yb = new YesBank();

    @Override
    public int balance() {
        return yb.checkBalance();
    }

    @Override
    public void addMoney(int x) {
        yb.deposit(x);
    }

    @Override
    public void remMoney(int x) {
        yb.withdraw(x);
    }
}
