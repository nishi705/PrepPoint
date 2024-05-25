package FairWork.IntroToOOPs;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age= 35;
        s1.name = "Sumeet";
        s1.psp = 100.0;
        s1.mockInterviews();

        Student s2 = new Student();
        s2.age = 10;
        s2.name = "Aryan";
        s2.psp = 50.0;
        s2.mockInterviews();
    }
}
