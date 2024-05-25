package FairWork.OOPs2.MemoryTopic.DemoCtors;

public class Person {
    int age;
    String name;

    Person(int page, String pname){
        age = page;
        name = pname;
    }

    Person(){
    }

    Person(Person p){
        age = p.age;
        name = p.name;
    }
}
