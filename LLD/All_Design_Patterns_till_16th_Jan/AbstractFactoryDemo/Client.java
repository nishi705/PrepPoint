package FairWork.AbstractFactoryDemo;

import FairWork.AbstractFactoryDemo.Factories.Factory;
import FairWork.AbstractFactoryDemo.Factories.Factory1;

public class Client {
    public static void main(String[] args) {
        System.out.println("hello");
        Factory f1 = new Factory1();

        A obj = new A(f1);
        obj.execute();
    }
}
