package FairWork.AdapterDesignPattern;

import FairWork.AdapterDesignPattern.thirdparty.ICICIBank;
import FairWork.AdapterDesignPattern.thirdparty.YesBank;

public class ICICIBankAdapter implements BankAPI {
    ICICIBank ib = new ICICIBank();

    @Override
    public int balance() {

        return ib.getBalance();
    }

    @Override
    public void addMoney(int x) {

        ib.doDeposit(x);
    }

    @Override
    public void remMoney(int x) {

        ib.doWithdraw(x);
    }
}
