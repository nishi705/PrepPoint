package FairWork.OOPs2.MemoryTopic.DemoCtors;

public class Client {
    public static void main(String[] args) {
        Person p = new Person(); // default ctor
        p.age = 10;
        p.name = "Aryan";
        System.out.println(p.age + " " + p.name);

        Person p1 = new Person(20, "Amit"); // parameterized ctor
        System.out.println(p1.age + " " + p1.name);

        Person p2 = p1; // will not call the copy ctor
        System.out.println(p1.age + " " + p2.age);
        p2.age = 30;
        System.out.println(p1.age + " " + p2.age);

        Person p3 = new Person(p1);
        System.out.println(p1.age + " " + p3.age);
        p3.age = 40;
        System.out.println(p1.age + " " + p3.age);

    }
}
