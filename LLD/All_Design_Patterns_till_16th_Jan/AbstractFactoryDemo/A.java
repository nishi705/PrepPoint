package FairWork.AbstractFactoryDemo;

import FairWork.AbstractFactoryDemo.Dependencies.D;
import FairWork.AbstractFactoryDemo.Factories.Factory;

public class A {
    private Factory f;

    A(Factory f){
        this.f = f;
    }

    void execute(){
        // A is getting it's dependency D via an abstract factory f.
        D o = f.getD();
        o.work();
    }
}
