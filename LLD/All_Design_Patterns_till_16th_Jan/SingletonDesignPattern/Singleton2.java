package FairWork.SingletonDesignPattern;

// Eager Loading Implementation
public class Singleton2 {
    // params

    // con -> If we require parameters to initialise, how to pass them.
    private static Singleton2 inst = new Singleton2();
    public static Singleton2 getInstance(){
        return inst;
    }
}
