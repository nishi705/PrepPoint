package FairWork.PrototypeAndRegistry;

public class MeritStudent extends Student implements Prototype<Student> {
    private int scholarship;

    public int getScholarship(){
        return scholarship;
    }

    public void setScholarship(int scholarship){
        this.scholarship = scholarship;
    }

    public MeritStudent(MeritStudent st){
        super(st);
        this.scholarship = st.scholarship;
    }

    public MeritStudent(){

    }

    public Student clone(){
        MeritStudent copy = new MeritStudent(this);
        return copy;
    }
}
