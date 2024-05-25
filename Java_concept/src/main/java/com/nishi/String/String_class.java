package com.nishi.String;

public class String_class {
    public static void main(String[] args) {
        //Strings are actually classes
    String x = new String("Hello");
    String y = new String("world");

    //here x,y both are  string object
        boolean compare = (x==y);
//not adviced to use == sign here output will be
//false because both are different object



    //second example
    String a = new String("hello");
    String b = new String("hello");
    boolean compare1 = (a==b);
    //even though the content are same still both object are entierly different
    //so, the output will be: false;


    //Third example
        String x1 = new String("hello");
        String y1 = new String("hello");
        x1.equals(y1);
        //Output: true, because equals method comparing
        //content of the object not object

//4rth example
        String x2 = new String("hello");
        String y2 = new String("helloss");
        x1.equals(y1);
        //output: false
        //because euqals method comparing the content of the
        //of the object and objects are different


    }
}
