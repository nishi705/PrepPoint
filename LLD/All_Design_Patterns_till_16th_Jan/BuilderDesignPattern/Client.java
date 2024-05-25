package FairWork.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student st2 = Student.getBuilder()
                        .setName("Sumeet")
                        .setAge(35)
                        .setGradYear(2009)
                        .setUnivName("PEC")
                        .build();
        System.out.println("DEBUG");
    }
}
