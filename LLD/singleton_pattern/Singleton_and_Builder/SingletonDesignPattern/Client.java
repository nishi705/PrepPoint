package FairWork.SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println("DEBUG");

        DBConnection c1 = DBConnection.getInstance("", "", "");
        DBConnection c2 = DBConnection.getInstance("", "", "");
        System.out.println("DEBUG");
    }
}
