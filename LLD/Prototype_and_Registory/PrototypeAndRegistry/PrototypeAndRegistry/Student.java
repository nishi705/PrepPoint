package FairWork.PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    private int psp;

    public int getPSP(){
        return psp;
    }

    public void setPSP(int psp){
        this.psp = psp;
    }

    private String batchName;

    public String getBatchName(){
        return batchName;
    }

    public void setBatchName(String batchName){
        this.batchName = batchName;
    }

    private String instName;

    public String getInstName(){
        return instName;
    }

    public void setInstName(String instName){
        this.instName = instName;
    }

    private int batchAvgPSP;

    public int getBatchAvgPSP(){
        return batchAvgPSP;
    }

    public void setBatchAvgPSP(int batchAvgPSP){
        this.batchAvgPSP = batchAvgPSP;
    }

    public Student(){

    }

    public Student(Student st){
        this.age = st.age;
        this.name = st.name;
        this.psp = st.psp;
        this.batchName = st.batchName;
        this.instName = st.instName;
        this.batchAvgPSP = st.batchAvgPSP;
    }

    public Student clone(){
        Student copy = new Student(this);
        return copy;
    }
}
