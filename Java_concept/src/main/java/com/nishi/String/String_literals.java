package com.nishi.String;

public class String_literals {
    public static void main(String[] args) {
        //first example
        String x = "hello";
        String y = "world";
        boolean com = (x==y);
        //Outpout: false;

        //second example
        String x1 = "hello";
        String y1 = "hello";
        boolean com1 = (x1==y1);
        //output: true

        //when we use string literals java automatically
        //creates object for us
        /*
        so, when we pass the literals we dont create new
        object so, java auto create one object and the pass value "hello
        so again when we create another variable with same value
        java says ohhh i already have object with same object so, a
        after using equal sign
         */


        //3rd exaple
        String x2 = "hello";
        String y2 = new String("hello");
        //we always use .equals method suppose we cretae
        /*
        two different variable first with string litrals and
        second we are creating manually string object
        in that case if we use == and content will be same
        still output will be false
         */
    }
}
