package FairWork.AbstractFactoryDemo.Factories;

import FairWork.AbstractFactoryDemo.Dependencies.*;

public class Factory1 implements Factory {
    @Override
    public D getD() {
        return new D1();
    }
}
