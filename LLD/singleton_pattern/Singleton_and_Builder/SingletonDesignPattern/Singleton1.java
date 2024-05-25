package FairWork.SingletonDesignPattern;

public class Singleton1 {
    // parameters

    private Singleton1(){

    }

    private static Singleton1 inst;
    public static synchronized Singleton1 getInstance(){
        if(inst == null){
            inst = new Singleton1();
        }
        return inst;
    }
}
