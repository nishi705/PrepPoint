package FairWork.PrototypeAndRegistry;

public class Client {
    static void fillRegistry(StudentRegistry reg){
        MeritStudent aprBatchMS = new MeritStudent();
        // set the details
        reg.register("April2022Merit", aprBatchMS);
    }

    public static void main(String[] args) {
        // populated at application start - begin
        StudentRegistry reg = new StudentRegistry();
        fillRegistry(reg);
        // populated at application start - end





        Student orig = reg.get("April2022Merit");
        orig.setName("A");
        orig.setAge(10);
        orig.setPSP(100);
        orig.setBatchName("April 2022");
        orig.setBatchAvgPSP(85);
        orig.setInstName("XYZ");
        ((MeritStudent)orig).setScholarship(50);
        fun(orig);
    }

    static void fun(Student orig){
        Student copy = orig.clone(); // here we won't use copy ctors, instead use clone

        copy.setName("B");


    }
}
