package FairWork.PrototypeAndRegistry;

public interface Prototype<T extends Student> {
    T clone();
}
