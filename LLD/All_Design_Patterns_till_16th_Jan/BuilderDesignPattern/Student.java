package FairWork.BuilderDesignPattern;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String univName;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGradYear(){
        return gradYear;
    }

    public String getUnivName(){
        return univName;
    }

    private Student(Builder b){
        if(b.getAge() < 0 || b.getAge() > 100){
            throw new IllegalArgumentException("Invalid age");
        }

        if(b.getGradYear() < 2000){
            throw new IllegalArgumentException("Invalid grad year");
        }

        if(b.getName() == null || b.getName().isEmpty()){
            // throw
        }

        name = b.getName();
        age = b.getAge();
        gradYear = b.getGradYear();
        univName = b.getUnivName();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;
        private int gradYear;
        private String univName;

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public int getGradYear(){
            return gradYear;
        }

        public String getUnivName(){
            return univName;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setUnivName(String univName){
            this.univName = univName;
            return this;
        }

        public Builder setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }

        Student build(){
            return new Student(this);
        }
    }
}
