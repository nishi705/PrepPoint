package FairWork.AbstractFactoryDemo.Factories;

import FairWork.AbstractFactoryDemo.Dependencies.*;

public class Factory2 implements Factory {
    @Override
    public D getD() {
        return new D2();
    }
}
